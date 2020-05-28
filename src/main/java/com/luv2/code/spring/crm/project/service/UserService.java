package com.luv2.code.spring.crm.project.service;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2.code.spring.crm.project.dao.RoleDAO;
import com.luv2.code.spring.crm.project.dao.UserDAO;
import com.luv2.code.spring.crm.project.entity.Role;
import com.luv2.code.spring.crm.project.entity.User;

@Service
public class UserService implements UserServiceInterface {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Autowired
//	private UserDAO userDAO;
//
//	@Autowired
//	private RoleDAO roleDAO;
//	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//
//	@Override
//	@Transactional
//	public User searchUserByUserName(String username) {
//		return userDAO.searchUserByUserName(username);
//	}
//
//	@Override
//	@Transactional
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userDAO.searchUserByUserName(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//				mapRolesToAuthorities(user.getRoles()));
//	}
//
//	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
//		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//	}
	
	

}
