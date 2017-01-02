                  package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	Logger log= LoggerFactory.getLogger(UserDAOImpl.class);
	
	
	
	

	SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
	
    this.sessionFactory= sessionFactory;	
		
	}
	
      
	

	
	@Transactional
	public boolean saveOrUpdate(User user){
	try
	{
		
		sessionFactory.getCurrentSession().saveOrUpdate(user);
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
		User user = new User();
		user.setId(id);
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public User get(String id){
		//log.debug("Starting of the method : get");
		String hql= "from User where id=" + "'" +id+"'";
		return getUserDetails(hql);	
	}
	
	
	/*public User  get(String id) {
		
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
		
		
	}*/
	
	@Transactional
	public User isValidUser(String id, String password)
	{
		log.debug("starting of the method: isValidUser");
		log.info("The user Id is "+ id);
		
		//Select * from User where id ='id' and password='password';
		String hql= "from User where id =" + "'"+ id + "'" + "and "
		+ "password ="+ "'"+ password + "'";
	    log.info("The query is :" + hql);
	    return getUserDetails(hql);
		
	}
	
	
	
	
	@Transactional
	public List<User> list() {
		
		String hql ="from User";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
	}

	
	@Transactional
	private User getUserDetails(String hql)
	{
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return (User)query.uniqueResult();
		
		}





	
	
	
	
	
	
}
