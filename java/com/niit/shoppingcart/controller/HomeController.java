package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

@Controller
public class HomeController {

	Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	User user;

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private Category category;

	@Autowired
	private SupplierDAO supplierDAO;

	

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public ModelAndView onLoad(HttpSession session) {
		log.debug("Starting of the method onLoad");
		ModelAndView mv = new ModelAndView("/index");
		session.setAttribute("Category", "category");
		session.setAttribute("Supplier", "supplier");
		session.setAttribute("Product", "product");

		session.setAttribute("categoryList", categoryDAO.list());
		session.setAttribute("supplierList", supplierDAO.list());
		session.setAttribute("productList", productDAO.list());
		mv.addObject("isUserClickedIndex", "true");

		log.debug("Ending of the method onLoad");
		return mv;

	}

	@RequestMapping("/register")
	public ModelAndView register() {
		log.debug("Starting of the method register");
		ModelAndView mv = new ModelAndView("/register");
		mv.addObject("user", user);
		mv.addObject("isUserClickedRegister", "true");
		mv.addObject("isUserClickedIndex", "true");
		log.debug("Ending of the method register");
		return mv;
	}

	@RequestMapping("/Login")
	public ModelAndView login() {
		log.debug("Starting of the method login");
		System.out.println("login");
		ModelAndView muv = new ModelAndView("/login");
		muv.addObject("user", user);
		muv.addObject("isUserClickedLogin", "true");
		muv.addObject("isUserClickedIndex", "true");
		log.debug("Ending of the method login");
		return muv;
	}

	@RequestMapping("/Logout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		log.debug("Starting of the logout method");
		ModelAndView mv = new ModelAndView("/index");
		session.invalidate();
		System.out.println("aaaaaaa");
		session.setAttribute("catrgory", category);
		session.setAttribute("categoryList", categoryDAO.list());
		mv.addObject("logoutMessage", "You have been successfully logged out");
		mv.addObject("loggedOut", "true");
		mv.addObject("isUserClickedIndex", "true");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		log.debug("Ending of the method logout");
		return mv;

	}

	@RequestMapping("/equipments")
	public ModelAndView equipments() {
		log.debug("Starting of the method equipments");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserClickedEquipments", "true");
		log.debug("Ending of the method equipments");
		return mv;
	}

	@RequestMapping("/aboutus")
	public ModelAndView aboutus() {
		log.debug("Starting of the method aboutus");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserClickedAboutus", "true");
		log.debug("Ending of the method aboutus");
		return mv;
	}

	@RequestMapping("/gym")
	public ModelAndView gym() {
		log.debug("Starting of the method gym");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserClickedGym", "true");
		log.debug("Ending of the method gym");
		return mv;
	}

}
