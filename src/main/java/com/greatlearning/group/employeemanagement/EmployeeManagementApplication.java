package com.greatlearning.group.employeemanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.group.employeemanagement.model.Employee;
import com.greatlearning.group.employeemanagement.model.Role;
import com.greatlearning.group.employeemanagement.model.User;
import com.greatlearning.group.employeemanagement.service.EmployeeService;
import com.greatlearning.group.employeemanagement.service.RoleService;
import com.greatlearning.group.employeemanagement.service.UserService;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner{

	@Autowired
	private RoleService roleService;
	@Autowired
	private UserService userService;
	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//ROLES
		Role adminRole = new Role("ROLE_ADMIN");
		Role userRole = new Role("ROLE_USER");
		roleService.addNewRole(adminRole);
		roleService.addNewRole(userRole);
		
		//USERS
		User userAdmin = new User();
		userAdmin.setUsername("siteadmin");
		userAdmin.setPassword("admin");
		userAdmin.setEnabled(true);
		List<Role> userAdminRoles = new ArrayList<Role>();
		userAdminRoles.add(userRole);
		userAdminRoles.add(adminRole);
		userAdmin.setRoles(userAdminRoles);
		userService.addUser(userAdmin);
		
		User userUser = new User();
		userUser.setUsername("siteuser");
		userUser.setPassword("user");
		userUser.setEnabled(true);
		List<Role> userUserRoles = new ArrayList<Role>();
		userUserRoles.add(userRole);
		userUser.setRoles(userUserRoles);
		userService.addUser(userUser);
		
		//EMPLOYEES
		Employee employee1 = new Employee();
		employee1.setFirstname("Rama");
		employee1.setLastname("Rama");
		employee1.setEmail("ram@gl.com");
		employeeService.addEmployee(employee1);
		

		Employee employee2 = new Employee();
		employee2.setFirstname("Bheema");
		employee2.setLastname("Bheema");
		employee2.setEmail("bheem@gl.com");
		employeeService.addEmployee(employee2);
		

		Employee employee3 = new Employee();
		employee3.setFirstname("Sita");
		employee3.setLastname("Sita");
		employee3.setEmail("sita@gl.com");
		employeeService.addEmployee(employee3);
		

		Employee employee4 = new Employee();
		employee4.setFirstname("Bharata");
		employee4.setLastname("Bharata");
		employee4.setEmail("bharat@gl.com");
		employeeService.addEmployee(employee4);
		
	}

}
