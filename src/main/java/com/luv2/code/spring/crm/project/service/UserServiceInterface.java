package com.luv2.code.spring.crm.project.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.luv2.code.spring.crm.project.entity.User;

public interface UserServiceInterface extends UserDetailsService {

	public User searchUserByUserName(String userName);
}
