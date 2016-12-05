package com.niit.shoppingcart.dao.impl;

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
public class CartDAOImpl implements CartDAO {
	
	private static Logger log = LoggerFactory.getLogger(CartDAOImpl.class);

	@Autowired
    SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
	@Transactional
	public List<Cart> list(String id)
	{
		log.debug("Starting of the method list");
		String hql ="from Cart where user_id =" + "'" + id + "' and status = " + "'N'";
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
	   cart.setId(getMaxId());
	   sessionFactory.openSession().save(cart);
	   log.debug("Ending of the method save");
   }
   
   @Transactional
   public String delete(String id){
	   log.debug("Starting of the method delete");
	   Cart cart = new Cart();
	   cart.setUserID(id);
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
   public Cart get(String id)
   {log.debug("Starting of the method get");
   String hql = "from Cart where user_id=" + "'" + id + "' and status = " + "'N'";
   Query query = sessionFactory.getCurrentSession().createQuery(hql);
   
   @SuppressWarnings("unchecked")
   List<Cart> list = (List<Cart>) query.list();
   
   if(list !=null && !list.isEmpty()){
	   return list.get(0);
   }
	   log.debug("Ending of the method get");
	   return null;
   }
   
   public Long getTotalAmount(String id){
	   log.debug("Starting of the method getTotalAmount");
	   String hql ="select sum(price) from Cart where user_id ="+ "'" + id + "'" + " and status = "+"'N'";
	   log.debug("hql" +hql);
	   
	   Query query = sessionFactory.getCurrentSession().createQuery(hql);
	   
	   Long sum = (Long) query.uniqueResult();
	   log.debug("sum = "+sum);
	   
	   log.debug("Ending of the method getTotalAmount");
	   return sum;
   }
   
   
   
   
	
 private long getMaxId()
 {
	 log.debug("->->Staritng of the method getMaxId");
	 
	 Long maxID =100L;
			 try{
				 String hql = "select max(id) from Cart";
				 Query query = sessionFactory.getCurrentSession().createQuery(hql);
				 maxID =(Long) query.uniqueResult();
			 }
	 catch(HibernateException e){
		 log.debug("It seems this is the first record, setting the intial id is 100 :");
		 maxID = 100L;
		 e.printStackTrace();
	 }
			 log.debug("Max id :" +maxID);
            return  maxID+1;	 
 
 }




		
	}

	
	



