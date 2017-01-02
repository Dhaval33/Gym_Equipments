package com.niit.shoppingcart.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;


@Repository("cartDAO")
public class CartDAOImpl implements CartDAO, Serializable {
	
	
	
	
	private static final long serialVersionUID = 1L;

	private static Logger log = LoggerFactory.getLogger(CartDAOImpl.class);

	@Autowired
    SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
	@Transactional
	public List<Cart> getByUser(String UserId)
	{
		log.debug("Starting of the method list");
		String hql ="from Cart where user_id =" + "'" + UserId + "'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> list = (List<Cart>) query.list();
		log.debug("Ending of the method list");
		 return list;
			
	}
	
	@Transactional
	public void update(Cart cart)
	{
		log.debug("Starting of the method update");
		sessionFactory.getCurrentSession().update(cart);
		log.debug("Ending of the method update");
	}
	
	@Transactional
   public void save(Cart cart)
   {
	   log.debug("Starting of the method save");
	   sessionFactory.getCurrentSession().save(cart);
	   log.debug("Ending of the method save");
   }
   
   @Transactional
   public String delete(int id){
	   log.debug("Starting of the method delete");
	   Cart cart = new Cart();
	   cart.setId(id);
	   try{
		   sessionFactory.getCurrentSession().delete(cart);
	   } catch (HibernateException e)
	   {
		   e.printStackTrace();
		   return e.getMessage();
	   }
	   log.debug("Ending of the method delete");
	   return null;
   }
   
   @Transactional
   public Cart get(int id)
   {log.debug("Starting of the method get");
   String hql = "from Cart where id=" + "'" + id + "'"; 
   Query query = sessionFactory.getCurrentSession().createQuery(hql);
   
   @SuppressWarnings("unchecked")
   List<Cart> list = (List<Cart>) query.list();
   
   if(list !=null && !list.isEmpty()){
	   return list.get(0);
   }
	   log.debug("Ending of the method get");
	   return null;
   }
   
   @Transactional
   public Double getTotalAmount(String id){
	   log.debug("Starting of the method getTotalAmount");
	   String hql ="select sum(price) from Cart where user_id ="+ "'" + id + "'";
	   log.debug("hql" +hql);
	   
	   Query query = sessionFactory.getCurrentSession().createQuery(hql);
	   
	   Double sum = (Double) query.uniqueResult();
	   log.debug("sum = "+sum);
	   
	   log.debug("Ending of the method getTotalAmount");
	   return sum;
   }
   
		
	}

	
	



