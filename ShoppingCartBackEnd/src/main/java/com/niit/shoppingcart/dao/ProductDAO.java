package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Product;



public interface ProductDAO {

	
	
	public boolean saveOrUpdate(Product product);
	
	public boolean delete(String id);
	
	public   Product get(String id);
	
	public Product getByName (String name);
	
	public List<Product>   list();
	

	

	
}
