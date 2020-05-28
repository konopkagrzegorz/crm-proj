package com.luv2.code.spring.crm.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2.code.spring.crm.project.entity.User;

@Repository
public class UserDAO implements UserDAOInterface {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public User searchUserByUserName(String username) {
		
		Session currentSession = sessionFactory.getCurrentSession();

		Query<User> theQuery = currentSession.createQuery("from User where userName=:uName", User.class);
		theQuery.setParameter("uName", username);
		
		User theUser = null;
		
		try {
			theUser = theQuery.getSingleResult();
		} catch (Exception e) {
			theUser = null;
		}
		return theUser;
	}
}
