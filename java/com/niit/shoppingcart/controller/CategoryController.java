package com.niit.shoppingcart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;


@Controller
public class CategoryController {
	
	public static Logger log = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	
	
	@RequestMapping(value="/manage_categories", method=RequestMethod.GET)
	public String listCategories(Model model){
		log.debug("Starting of the method listCategories");
		model.addAttribute("category", category);
		model.addAttribute("categoryList",this.categoryDAO.list());
		model.addAttribute("isAdminClickedCategories", "true");
		log.debug("Ending of the method listCategories");
		return "index";
		
	}
	
	@RequestMapping(value="/manage_category_add", method= RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, Model model)
	{ log.debug("Starting off the method addCategory");
	  log.debug("id:" + category.getId());
	  
	 if(categoryDAO.saveOrUpdate(category)== true){
		 model.addAttribute("msg", "Sucessfully created/updated the category");
		 }
		
		else
		{
			model.addAttribute("msg", "Not able to create/update the category, please re-enter the ID again to verify");
		}
		model.addAttribute("category", category);
		model.addAttribute("categoryList",categoryDAO.list());
		model.addAttribute("isAdminClickedCategories", "true");
		log.debug("Ending of the method addCategory");
		return "index";		
	}
       @RequestMapping("manage_category_remove")
      public String deleteCategory(@RequestParam("id") String id, Model model) throws Exception
      {
    	Boolean flag= categoryDAO.delete(id);
    	
        String msg ="Successfully done the operation";
        
        if(!flag==true)
   		  msg= "opreation could not be success";
   	
   	
    	
    	model.addAttribute("msg" ,msg);
    	return "forward:/manage_categories";
      }
       
       @RequestMapping("manage_category_edit")
       public String editCategory(@RequestParam("id") String id, Model model)
       {
    	   log.debug("Starting of the method editCategory");
    	   
    	   category= categoryDAO.get(id);
    	   model.addAttribute("category", category);
    	   log.debug("End of the method editCategory");
    	   return "forward:/manage_categories";
    	   
       }
    	      
       }
       

