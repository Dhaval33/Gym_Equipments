package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;


@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
	
	

	
	
	
	@Transactional
	public List<Product> list() {
		
		String hql ="from Product";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
	}
	
	@Transactional
	public boolean saveOrUpdate(Product product){
	try
	{
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}
	catch (HibernateException e)
	{
		e.printStackTrace();
		return false;
	}
	
}
	
	
	@Transactional
	public boolean delete(String id){
		Product product = new Product();
		product.setId(id);
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}




	@Transactional
	public Product  get(String id) {
		
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		
		
	}
		
	
		
	@Transactional
	public Product getByName (String name)
	{
		String hql="from Product where name ="+"'"+name +"'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		return (Product)query.uniqueResult();
	}

	
	}

	
	

	

