package com.luv2.code.spring.crm.project.dao;

import org.springframework.stereotype.Repository;

import com.luv2.code.spring.crm.project.entity.User;

public interface UserDAOInterface {
	
	public User searchUserByUserName(String username);

}
