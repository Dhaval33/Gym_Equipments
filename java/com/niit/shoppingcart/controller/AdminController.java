package com.niit.shoppingcart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class AdminController {

	public static Logger log = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Supplier supplier;
	
	
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Product product;
	
	
	
	@RequestMapping("manageCategories")
	public ModelAndView categories()
	{
		log.debug("Starting of the method Categories");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("category" , category);
		mv.addObject("isAdminnClickedCategories", "true");
		mv.addObject("categoryList" , categoryDAO.list());
		log.debug("Ending of the method Categories");
		return mv;
	}
	
	@RequestMapping("manageSuppliers")
	public ModelAndView suppliers()
	{
		log.debug("Starting of the method Suppliers");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("supplier" , supplier);
		mv.addObject("isAdminnClickedSuppliers", "true");
		mv.addObject("supplierList" , supplierDAO.list());
		log.debug("Ending of the method Suppliers");
		return mv;
		
	}
		
		@RequestMapping("manageProducts")
		public ModelAndView products()
		{
			log.debug("Starting of the method  Products");
			ModelAndView mv= new ModelAndView("/index");
			mv.addObject("product", product);
			mv.addObject("productList", productDAO.list());
			mv.addObject("product", product);
			mv.addObject("categoryList", categoryDAO.list());
			mv.addObject("supplier", supplier);
			mv.addObject("supplierList", supplierDAO.list());
		    return mv;
		}
		
		
		
	}

