package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTestCase {

	
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	 static Product product;
	
    @Autowired
	 static ProductDAO productDAO;
    
    @BeforeClass
    public static  void init()
   
    {
    	context= new AnnotationConfigApplicationContext();
    	context.scan("com.niit.shoppingcart");
    	context.refresh();
    	
    productDAO=  (ProductDAO) context.getBean("productDAO");
    
    product= (Product) context.getBean("product");
    
    System.out.println(" the products are created");
    
    }
    
    // test products
    
   // @Test
     public void  createProductTestCase()
    {
    	
    	product.setId("POD-03");
    	product.setName("Hammer Strength Machine");
    	product.setPrice(90000);
    	product.setCategory_id("GYM-01");
    	product.setSupplier_id("SUP-01");
    	
    	boolean status= productDAO.saveOrUpdate(product);
    	
    	Assert.assertEquals("Create product test case", true, status);
    	
    	 }
    
    /*@Test
	public   void deleteProductTestCase()
	{
		product.setId("GYM-06");
		boolean status= productDAO.delete(product);
		Assert.assertEquals("Delete Product Test Case", true, status);
	}*/

	

	/*@Test
	public   void updateProductTestCase()
	{
		
		
		    product.setId("GYM-01");
			product.setDescription("This is used to strengthen the Upperbody Muscles");
			
		
		
		boolean status= productDAO.update(product);
		
		Assert.assertEquals("Update Product Test Case", true, status);
		
	
	}*/
	
	/*@Test
	public   void getProductTestCase()
	{
		Assert.assertEquals("Get Product Test Case", null, productDAO.get("abcd"));
	}
	
	
	@Test
	public   void getAllProductTestCase()
	{
		Assert.assertEquals("Get All Product Test Case", 1, productDAO.list().size());
	}*/
	
	
}

    
    

