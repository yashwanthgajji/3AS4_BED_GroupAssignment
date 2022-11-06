package com.greatlearning.group.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.group.employeemanagement.model.Role;
import com.greatlearning.group.employeemanagement.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roles")
	public List<Role> displayAllRoles() {
		return roleService.getAllRoles();
	}
	
	@PostMapping("roles/add")
	public String addRole(@RequestBody Role role) {
		roleService.addNewRole(role);
		return "Role added";
	}
}
