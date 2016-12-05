package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
	
	
	
	
	
	@Transactional
	public List<Category> list() {
		
		String hql ="from Category";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
	}
	
	@Transactional
	public boolean saveOrUpdate(Category category){
	try
	{
		
		sessionFactory.getCurrentSession().saveOrUpdate(category);
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
		Category category = new Category();
		category.setId(id);
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}




	@Transactional
	public Category  get(String id) {
		
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
		
		
	}
		
	
		
	@Transactional
	public Category getByName (String name)
	{
		String hql="from Category where name ="+"'"+name +"'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		return (Category)query.uniqueResult();
	}

	
	}

	
	

	

