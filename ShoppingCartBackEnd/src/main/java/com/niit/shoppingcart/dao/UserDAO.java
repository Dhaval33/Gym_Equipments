package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.User;



public interface UserDAO {

	//CRUD operations
	
	public boolean saveOrUpdate(User user);
	
	
	
	public boolean delete(String id);
	
	public   User get(String id);
	
	public List<User>   list();

	public User isValidUser(String userID, String password);

	

	
}
