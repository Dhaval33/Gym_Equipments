package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	 static User user;
	
   @Autowired
	 static UserDAO userDAO;
   
   @BeforeClass
   public static  void init()
  
   {
   	context= new AnnotationConfigApplicationContext();
   	context.scan("com.niit.shoppingcart");
   	context.refresh();
   	
   userDAO=  (UserDAO) context.getBean("userDAO");
   
   user= (User) context.getBean("user");
   
   System.out.println(" the users are created");
   
   }
   
   // test users
   
   @Test
    public void  createUserTestCase()
   {
   	
   	user.setId("USR-01");
   	user.setName("Admin");
   	user.setPassword("Admin@333");
   	user.setContact("+91 9833637845");
   	
   	
   	// ROLE IS FOR SETTING USER(SYS_USER) OR ADMIN(SYS_ADMIN)
   	
   	user.setRole("SYS_ADMIN");
   	
   	
   	boolean status= userDAO.saveOrUpdate(user);
   	
   	Assert.assertEquals("Create user test case", true, status);
   	
   	 }
  /* @Test
	public   void deleteUserTestCase()
	{
		user.setId("GYM-06");
		boolean status= userDAO.delete(user);
		Assert.assertEquals("Delete User Test Case", true, status);
	}*/

	

	/*@Test
	public   void updateUserTestCase()
	{
		
		
		    user.setId("USR-01");
		    user.setName("Admin");
		   	user.setPassword("Admin@333");
		   	user.setContact("+91 9833637845");
		   	user.setAddress("India");
		   	user.setRole("SYS_ADMIN");
			user.setBilling_address("India");
			
		
		
		boolean status= userDAO.update(user);
		
		Assert.assertEquals("Update User Test Case", true, status);
		
	
	}
	
	/*@Test
	public   void getUserTestCase()
	{
		Assert.assertEquals("Get User Test Case", null, userDAO.get("abcd"));
	}
	
	
	@Test
	public   void getAllUserTestCase()
	{
		Assert.assertEquals("Get All User Test Case", 1, userDAO.list().size());
	}*/
	
	
}
