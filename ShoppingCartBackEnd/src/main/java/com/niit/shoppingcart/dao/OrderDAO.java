package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Order;



public interface OrderDAO {

	
	public void saveOrUpdate(Order order);
	
	public String delete(String id);
	
	public  Order get(String id);
	
	public List<Order>   list(String id);
	
	public Long getTotalAmount(String id);
}
