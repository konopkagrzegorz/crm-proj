package com.luv2.code.spring.crm.project.dao;

import org.springframework.stereotype.Repository;

import com.luv2.code.spring.crm.project.entity.Role;

public interface RoleDAOInterface {

	public Role searchRoleByName(String name);
}
