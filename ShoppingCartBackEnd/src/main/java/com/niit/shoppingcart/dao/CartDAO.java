package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Cart;



public interface CartDAO {

	//CRUD operations
	
	
	
	public List<Cart> list (String id);
	
	public void save(Cart cart);
	
	public void update(Cart cart);
	
	public String delete(String id);
	
	public Long getTotalAmount(String id);

	
}
