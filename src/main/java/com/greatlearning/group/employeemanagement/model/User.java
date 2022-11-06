package com.greatlearning.group.employeemanagement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	
	@Id
	private String username;
	private String password;
	private boolean enabled;
	
	@ManyToMany
	@JoinTable(name = "authorities", joinColumns = @JoinColumn(referencedColumnName = "username", name = "username"), inverseJoinColumns = @JoinColumn(referencedColumnName = "role_id", name = "roles"))
	private List<Role> roles;
}
