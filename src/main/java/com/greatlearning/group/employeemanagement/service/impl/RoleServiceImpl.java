package com.greatlearning.group.employeemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.group.employeemanagement.model.Role;
import com.greatlearning.group.employeemanagement.repository.RoleRepository;
import com.greatlearning.group.employeemanagement.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}
	
	@Override
	public void addNewRole(Role role) {
		roleRepository.save(role);
	}
}
