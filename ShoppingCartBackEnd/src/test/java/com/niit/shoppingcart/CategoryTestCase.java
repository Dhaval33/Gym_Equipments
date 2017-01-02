package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;



public class CategoryTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	@Autowired
	 static Category category;
	
	@Autowired
	  static CategoryDAO categoryDAO;
	
	
	@BeforeClass
	
	public static  void init()
	
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		categoryDAO  =(CategoryDAO) context.getBean("categoryDAO");
		
		 category =(Category)  context.getBean("category");
		
		System.out.println("the objects are created");
		
	}
		
		//We need to write test cases for each method defined in DAO
	
	
		@Test
		
		public   void createCategoryTestCase()
		{
			
			
			    category.setId("GYM-06");
				category.setDescription("They help in overall Body Development");
				category.setName("Gym Accessories");
			
			
			boolean status= categoryDAO.saveOrUpdate(category);
			
			Assert.assertEquals("Create Category Test Case", true, status);
			
		
		}
        
		/*@Test
		public   void deleteCategoryTestCase()
		{
			category.setId("GYM-06");
			boolean status= categoryDAO.delete(category);
			Assert.assertEquals("Delete Category Test Case", true, status);
		}*/
	
		

		/*@Test
		public   void updateCategoryTestCase()
		{
			
			
			    category.setId("GYM-01");
				category.setDescription("This is used to strengthen the Upperbody Muscles");
				
			
			
			boolean status= categoryDAO.update(category);
			
			Assert.assertEquals("Update Category Test Case", true, status);
			
		
		}*/
		
		/*@Test
		public   void getCategoryTestCase()
		{
			Assert.assertEquals("Get Category Test Case", null, categoryDAO.get("abcd"));
		}
		
		
		@Test
		public   void getAllCategoryTestCase()
		{
			Assert.assertEquals("Get All Category Test Case", 1, categoryDAO.list().size());
		}*/
		
		
}

	
	
	
	
	
	
	
	
	
	
	

