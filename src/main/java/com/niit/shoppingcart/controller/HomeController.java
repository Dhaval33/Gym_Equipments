package com.niit.shoppingcart.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@ Controller
public class HomeController {
	
	
	
	@RequestMapping("/")
	public String gotHome()
	{
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout()
	{
		return "index";
	}
	
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		return "aboutus";
	}
	
	
	
	@RequestMapping("/validate")
	
	
	public String validate(@RequestParam(name="UserID")String UserID , @RequestParam(name="password")String password , Model model, HttpSession session)
	{
		
		// Validate- hit the database to validate-
		//NIIT
		
		if(UserID.equals(password))
		{
			
	model.addAttribute("successMessage", "You successfully logged in");
	//session.setAttribute("successMessage", "You successfully logged in");
	
	return "index";
	
	}
	else
	{
		model.addAttribute("errorMessage", "Invalid creditianls, please try again");
		return "index";
	}
	
		//SPA
	}
	
     
	
	@RequestMapping("/login")
	
	public String login(Model model)
	
	{
		//String name="NIIT"
		//${name}- spring EL-Expression Language
		
		
	model.addAttribute("userClickedLogin", "true");
	return "login";
	}
	
	@RequestMapping("/register")
	
	
	public String register(Model model){
		
		model.addAttribute("userClickedRegister", "true");
		return "register";
		
	}
}
