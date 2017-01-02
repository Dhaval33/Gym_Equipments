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

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;


@Controller
public class SupplierController {
	
	public static Logger log = LoggerFactory.getLogger(SupplierController.class);
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Supplier supplier;
	
	
	
	@RequestMapping(value="/manage_suppliers", method=RequestMethod.GET)
	public String listSuppliers(Model model){
		log.debug("Starting of the method listSuppliers");
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList",this.supplierDAO.list());
		model.addAttribute("isAdminClickedSuppliers", "true");
		log.debug("Ending of the method listSuppliers");
		return "index";
		
	}
	
	@RequestMapping(value="/manage_supplier_add", method= RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier, Model model)
	{ log.debug("Starting off the method addSupplier");
	  log.debug("id:" + supplier.getId());
	  
	 if(supplierDAO.saveOrUpdate(supplier)== true){
		 model.addAttribute("msg", "Sucessfully created/updated the supplier");
		 }
		
		else
		{
			model.addAttribute("msg", "Not able to create/update the supplier, please re-enter the ID again to verify");
		}
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList",supplierDAO.list());
		model.addAttribute("isAdminClickedSuppliers", "true");
		log.debug("Ending of the method addSupplier");
		return "index";		
	}
       @RequestMapping("manage_supplier_remove")
      public String deleteSupplier(@RequestParam("id") String id, Model model) throws Exception
      {
    	Boolean flag= supplierDAO.delete(id);
    	
        String msg ="Successfully done the operation";
        
        if(!flag==true)
   		  msg= "opreation could not be success";
   	
   	
    	
    	model.addAttribute("msg" ,msg);
    	return "forward:/manage_suppliers";
      }
       
       @RequestMapping("manage_supplier_edit")
       public String editSupplier(@RequestParam("id") String id, Model model)
       {
    	   log.debug("Starting of the method editSupplier");
    	   
    	   supplier= supplierDAO.get(id);
    	   model.addAttribute("supplier", supplier);
    	   log.debug("End of the method editSupplier");
    	   return "forward:/manage_suppliers";
    	   
       }
    	      
       }
       

