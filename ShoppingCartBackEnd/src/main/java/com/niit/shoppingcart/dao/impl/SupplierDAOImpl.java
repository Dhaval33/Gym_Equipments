package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;


@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
	
	

	
	@Transactional
	public List<Supplier> list() {
		
		String hql ="from Supplier";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
	}
	
	@Transactional
	public boolean saveOrUpdate(Supplier supplier){
	try
	{
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
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
		Supplier supplier = new Supplier();
		supplier.setId(id);
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}




	@Transactional
	public Supplier  get(String id) {
		
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
		
		
	}
		
	
		
	@Transactional
	public Supplier getByName (String name)
	{
		String hql="from Supplier where name ="+"'"+name +"'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		return (Supplier)query.uniqueResult();
	}

	
	}

	
	

	

