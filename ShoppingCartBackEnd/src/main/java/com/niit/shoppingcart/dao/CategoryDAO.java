package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;



public interface CategoryDAO {

	
	
	public boolean saveOrUpdate(Category category);
	
	public boolean delete(String id);
	
	public   Category get(String id);
	
	public Category getByName (String name);
	
	public List<Category>   list();
	

	

	
}
