package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.OrdersDAO;
import com.niit.shoppingcart.model.Orders;

public class OrdersTestCase {

	
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	 static Orders orders;
	
    @Autowired
	 static OrdersDAO ordersDAO;
    
    @BeforeClass
    public static  void init()
   
    {
    	context= new AnnotationConfigApplicationContext();
    	context.scan("com.niit.shoppingcart");
    	context.refresh();
    	
    ordersDAO=  (OrdersDAO) context.getBean("ordersDAO");
    
    orders= (Orders) context.getBean("orders");
    
    System.out.println(" the orderss are created");
    
    }
    
    //@Test
    public void  createCartTestCase()
   {
   	
   	orders.setOrdersID("ORD-01");
   	orders.setCart("CAR-01");
   	orders.setPaymentMethod("Cash on Delivery");
   	orders.setBillingAddress("India");
   	
   	
   	
   	boolean status= ordersDAO.save(orders);
   	
   	Assert.assertEquals("Create cart test case", true, status);
   	
   	 }
    /*@Test
	public   void deleteOrdersTestCase()
	{
		orders.setId("GYM-06");
		boolean status= ordersDAO.delete(orders);
		Assert.assertEquals("Delete Orders Test Case", true, status);
	}*/

	

	/*@Test
	public   void updateOrdersTestCase()
	{
		
		
		    orders.setId("GYM-01");
			orders.setDescription("This is used to strengthen the Upperbody Muscles");
			
		
		
		boolean status= ordersDAO.update(orders);
		
		Assert.assertEquals("Update Orders Test Case", true, status);
		
	
	}*/
	
	/*@Test
	public   void getOrdersTestCase()
	{
		Assert.assertEquals("Get Orders Test Case", null, ordersDAO.get("abcd"));
	}
	
	
	@Test
	public   void getAllOrdersTestCase()
	{
		Assert.assertEquals("Get All Orders Test Case", 1, ordersDAO.list().size());
	}*/
	
	
}
