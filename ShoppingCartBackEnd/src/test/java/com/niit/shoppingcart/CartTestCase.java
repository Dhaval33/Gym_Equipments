package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;

public class CartTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	 static Cart cart;
	
   @Autowired
	 static CartDAO cartDAO;
   
   @BeforeClass
   public static  void init()
  
   {
   	context= new AnnotationConfigApplicationContext();
   	context.scan("com.niit.shoppingcart");
   	context.refresh();
   	
   cartDAO=  (CartDAO) context.getBean("cartDAO");
   
   cart= (Cart) context.getBean("cart");
   
   System.out.println(" the carts are created");
   
   }
   
   // test carts
   
  // @Test
    public void  createCartTestCase()
   {
   	
   	cart.setId("CAR-01");
   	cart.setProduct_id("P0D-01");
   	cart.setQuantity(1);
   	cart.setPrice(90000);
   	
   	
   	
   	boolean status= cartDAO.save(cart);
   	
   	Assert.assertEquals("Create cart test case", true, status);
   	
   	 }

   /*@Test
	public   void deleteCartTestCase()
	{
		cart.setId("GYM-06");
		boolean status= cartDAO.delete(cart);
		Assert.assertEquals("Delete Cart Test Case", true, status);
	}*/

	

	/*@Test
	public   void updateCartTestCase()
	{
		
		
		    cart.setId("GYM-01");
			cart.setDescription("This is used to strengthen the Upperbody Muscles");
			
		
		
		boolean status= cartDAO.update(cart);
		
		Assert.assertEquals("Update Cart Test Case", true, status);
		
	
	}*/
	
	/*@Test
	public   void getCartTestCase()
	{
		Assert.assertEquals("Get Cart Test Case", null, cartDAO.get("abcd"));
	}
	
	
	@Test
	public   void getAllCartTestCase()
	{
		Assert.assertEquals("Get All Cart Test Case", 1, cartDAO.list().size());
	}*/
	
	
}
