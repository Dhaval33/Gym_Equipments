package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.OrderDAO;
import com.niit.shoppingcart.model.Order;

public class OrdersTestCase {

	
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	 static Order order;
	
    @Autowired
	 static OrderDAO orderDAO;
    
    @BeforeClass
    public static  void init()
   
    {
    	context= new AnnotationConfigApplicationContext();
    	context.scan("com.niit.shoppingcart");
    	context.refresh();
    	
    orderDAO=  (OrderDAO) context.getBean("orderDAO");
    
    order= (Order) context.getBean("order");
    
    System.out.println(" the orders are created");
    
    }
    
    @Test
    public void  createCartTestCase()
   {
   	
   	order.setOrderID("ORD-01");
   	order.setUserID("Dhaval123");
   	order.setPaymentMethod("Cash on Delivery");
   	
   	
   	
   	
   	 orderDAO.saveOrUpdate(order);
   	
   	Assert.assertEquals(order, ("Create order test case"));
   	
   	 }
    /*@Test
	public   void deleteOrderTestCase()
	{
		order.setId("GYM-06");
		boolean status= orderDAO.delete(order);
		Assert.assertEquals("Delete Order Test Case", true, status);
	}*/

	

	/*@Test
	public   void updateOrderTestCase()
	{
		
		
		    order.setId("GYM-01");
			order.setDescription("This is used to strengthen the Upperbody Muscles");
			
		
		
		boolean status= orderDAO.update(order);
		
		Assert.assertEquals("Update Order Test Case", true, status);
		
	
	}*/
	
	/*@Test
	public   void getOrderTestCase()
	{
		Assert.assertEquals("Get Order Test Case", null, orderDAO.get("abcd"));
	}
	
	
	@Test
	public   void getAllOrderTestCase()
	{
		Assert.assertEquals("Get All Order Test Case", 1, orderDAO.list().size());
	}*/
	
	
}
