package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;



public class SupplierTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	@Autowired
	 static Supplier supplier;
	
	@Autowired
	  static SupplierDAO supplierDAO;
	
	
	@BeforeClass
	
	public static  void init()
	
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		supplierDAO  =(SupplierDAO) context.getBean("supplierDAO");
		
		 supplier =(Supplier)  context.getBean("supplier");
		
		System.out.println("the objects are created");
		
	}
		
		//We need to write test cases for each method defined in DAO
	
	
		@Test
		
		public   void createSupplierTestCase()
		{
			
			    supplier.setId("SUP-04");
				supplier.setAddress("304 Ghandhi Road, Near Himalayan Castle, India");
				supplier.setName("Omegc Suppliers");
			
			
			boolean status= supplierDAO.saveOrUpdate(supplier);
			
			Assert.assertEquals("Create Supplier Test Case", true, status);
			
		
		}
        
		//@Test
		public   void deleteSupplierTestCase()
		{
			supplier.setId("SUP-04");
			
			boolean status= supplierDAO.delete("abc");
			Assert.assertEquals("Delete Supplier Test Case", true, status);
		}
	
		

	
		
		/*@Test
		public   void getSupplierTestCase()
		{
			Assert.assertEquals("Get Supplier Test Case", null, supplierDAO.get("abcd"));
		}
		
		
		@Test
		public   void getAllSupplierTestCase()
		{
			Assert.assertEquals("Get All Supplier Test Case", 1, supplierDAO.list().size());
		}*/
		
		
}

	
	
	
	
	
	
	
	
	
	
	

