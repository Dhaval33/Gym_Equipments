package com.niit.shoppingcart.controller;




import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.User;



@Controller
public class UserController {
	
	Logger log= LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	private CartDAO cartDAO;
	
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Supplier supplier;
	
	
	
	
	
	@RequestMapping(value="/validate")
	public ModelAndView login( HttpSession session)
	{
		log.debug("Starting of the method login" );
		//log.debug("userID is {}  password is {}", userID, password);
		
		ModelAndView mv= new ModelAndView("/index");
	   // user= userDAO.isValidUser(userID,password);
		// if the record exist with this UserID and password it will return user details else will return null
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String userID =null;
		if (auth != null) {
			userID =auth.getName();
		}
		user= userDAO.get(userID);
		
	    if(user!= null)
	    {
	    	//if the Credentials are valid, load the categories
	    	
	    	log.debug("Valid credintials");
	    	user= userDAO.get(userID);
	    	session.setAttribute("loggedInUser", user.getName());
	    	session.setAttribute("loggedInUserID",user.getId());
	    	session.setAttribute("user", user);
	    	mv.addObject("isUserClickedIndex", "true");
	    	
	    	
	    	 if(user.getRole().equals("ROLE_ADMIN"))
	    	{
	    		log.debug("Logged in as Admin");
	    		
	    		mv.addObject("isAdmin", "true");
	    		session.setAttribute("loggedInAdmin", user.getName());
	    		session.setAttribute("supplier", supplier);
	    		session.setAttribute("supplierList", supplierDAO.list());
	         
	    		session.setAttribute("category", category);
	    		session.setAttribute("categoryList", categoryDAO.list());
	    		mv.addObject("isUserClickedIndex", "true");
             
	    		
	    		
	    	}
	    	
	    	 else{
	    		log.debug("Logged in as User");
	    		mv.addObject("isAdmin", "false");
	    		//Fetch the list based on Cart userID
	    	   List<Cart> cartList =cartDAO.getByUser(userID);
	    	   mv.addObject("cartList", cartList);
	    	   mv.addObject("cartSize",cartList.size());
	    		}
	    	 	
	 }else
	 {
		 log.debug("Invalid Credentials");
		 mv.addObject("invalidCredentials","true");
		 mv.addObject("errorMessage", "Invalid Credentials");
		 mv.addObject("isUserClickedIndex", "true");
		 
	 }
	    
	    log.debug("Ending of the method Login");
	    mv.addObject("isUserClickedIndex", "true");
		return mv;
	    
	 

	}

	
	
	
	
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public ModelAndView register(@ModelAttribute User user)
	{
		log.debug("Starting of the method register");
		ModelAndView mv= new ModelAndView("/index");
		if(userDAO.get(user.getId())== null){
			user.setRole("ROLE_USER");
			user.setId(user.getUserId());
			userDAO.saveOrUpdate(user);
		log.debug("You are successfully registered");
			mv.addObject("successMessage", "You are successfully registered");
			mv.addObject("isUserClickedIndex", "true");
		}else
		{
			log.debug("User exists with this ID");
			mv.addObject("errorMessage","User exists with this ID");
		}
		log.debug("End of the method register");
		mv.addObject("isUserClickedIndex", "true");
        return mv;
	}
	
	@RequestMapping(value="/loginError" , method= RequestMethod.GET)
	public String loginError(Model model){
		log.debug("Starting of the method loginError");
		model.addAttribute("errorMessage", "loginError");
		log.debug("Ending of the method loginError");
		return "login";
	}
	
	@RequestMapping(value="/accessDenied", method= RequestMethod.GET)
	public String accessDenied(Model model)
	{log.debug("Starting of the method accessDenied");
	model.addAttribute("errorMessage" ,"You are not authorized to access this page");
	log.debug("ending of the method accessDenied");
	return "index";
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
