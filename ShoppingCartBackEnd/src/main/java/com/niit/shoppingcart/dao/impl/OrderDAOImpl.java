package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.OrderDAO;
import com.niit.shoppingcart.model.Order;


@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO {

	private SessionFactory sessionFactory;
	
	public OrderDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
	public OrderDAOImpl(){
		
	}
	
	
	public List<Order> list (String id){
		String hql="from order where userID="+"'" +id + "'  and status= " + "'N'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Order> list = (List<Order>) query.list();
		
		return list;		
	}
	
	@Transactional
	public void saveOrUpdate(Order order){
		sessionFactory.getCurrentSession().saveOrUpdate(order);
	}
	
	@Transactional
	public String delete(String id){
		Order order = new Order();
		order.setOrderID(id);
		try
		{
			sessionFactory.getCurrentSession().delete(order);
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return e.getMessage();
		}
		return null;
	}
		
	@Transactional
	public Order get(String id)
	{
		String hql="from order where userID="+"'" +id + "'  and status= " + "'N'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Order> list =(List<Order>)query.list();
		if(list!= null && !list.isEmpty()){
			return list.get(0);
		}
		
		return null;
		
	}
	@Transactional
	public Long getTotalAmount(String id)
	{ Long sum = null;
		String hql ="select sum(price) from Order where userID="+"'" + id +"'" +
	                 " and status = " + "'N'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return sum;
	
	
	
		
	}

	
	
	

}
