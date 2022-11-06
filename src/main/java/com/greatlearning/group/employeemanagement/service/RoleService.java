package com.greatlearning.group.employeemanagement.service;

import java.util.List;

import com.greatlearning.group.employeemanagement.model.Role;

public interface RoleService {
	List<Role> getAllRoles();
	void addNewRole(Role role);
}