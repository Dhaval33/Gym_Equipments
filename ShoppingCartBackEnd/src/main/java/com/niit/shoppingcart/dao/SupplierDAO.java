package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;



public interface SupplierDAO {

	
	
	public boolean saveOrUpdate(Supplier category);
	
	public boolean delete(String id);
	
	public   Supplier get(String id);
	
	public Supplier getByName (String name);
	
	public List<Supplier>   list();
	

	

	
}
