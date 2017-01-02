package com.niit.shoppingcart.controller;

import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;

@Controller
public class CartController {
	Logger log =LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private ProductDAO productDAO;
	
	
	@RequestMapping(value= "/cart" , method = RequestMethod.GET)
	public String cart(Model model , HttpSession session)
	{
		log.debug("Starting of the method cart");
		model.addAttribute("cart" , new Cart());
		//get the logged-in user Id
	String loggedInUserid = (String)session.getAttribute("loggedInUserID");
	
	if(loggedInUserid == null){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		loggedInUserid =auth.getName();
	}
	
	int cartSize = cartDAO.getByUser(loggedInUserid).size();
	
	if(cartSize==0){
		model.addAttribute("errorMessage", "You do not have any products in your Cart" );
		}
	else
	{
		model.addAttribute("cartList" , cartDAO.getByUser(loggedInUserid));
		model.addAttribute("totalAmount", cartDAO.getTotalAmount(loggedInUserid));
		model.addAttribute("displayCart", true);
		
	}
	log.debug("Ending of the method cart");
	return "index";
	}
	
	
	//For add and update both
	@RequestMapping(value="/cart_add" , method = RequestMethod.GET)
	public ModelAndView addToCart(@RequestParam("id") String id , HttpSession session)
	{
		log.debug("Starting of the method addToCart");
		//get the product based on product id
		Product product =productDAO.get(id);
		cart.setPrice(product.getPrice());
		cart.setProductName(product.getName());
		cart.setQuantity(1);
		
		
		String loggedInUserid = (String)session.getAttribute("loggedInUserID");
		
		if(loggedInUserid == null)
		{
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			loggedInUserid =auth.getName();
		}
		
	cart.setUserID(loggedInUserid);
	cart.setId(ThreadLocalRandom.current().nextInt(100, 1000000 + 1));
	cartDAO.save(cart);
	
	ModelAndView mv = new ModelAndView("/index");
	mv.addObject("successMessage"," Successfully add the product to Cart");
	log.debug("Ending of the method addToCart");
	mv.addObject("isUserClickedIndex","true");
    return mv;
	}
	
	@RequestMapping("cart_delete")
	public ModelAndView removeCart(@RequestParam("id") int id, Model model) throws Exception
	{
		log.debug("Starting of the method removeCart");
		try{
			cartDAO.delete(id);
			model.addAttribute("successMessage" , "Successfully Removed from your cart");
			}
		catch(Exception e)
		{
			model.addAttribute("message" , e.getMessage());
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserClickedIndex","true");
		log.debug("Ending of the method removeCart");
		return mv;
	}

}

	
	
	
