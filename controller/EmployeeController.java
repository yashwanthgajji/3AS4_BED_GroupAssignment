package com.greatlearning.group.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.group.employeemanagement.model.Employee;
import com.greatlearning.group.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String welcome() {
		return "<h1>Hello Welcome!</h1>";
	}
	
	@GetMapping("/employees")
	public List<Employee> showAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee showEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/employees/search/{firstname}")
	public List<Employee> showAllEmployeesWithGivenFirstName(@PathVariable("firstname") String firstName) {
		return employeeService.getAllEmployeesByFirstName(firstName);
	}
	
	@PostMapping("/employees/add")
	public Employee addNewEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PostMapping("/employees/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@GetMapping("/employees/sort")
	public List<Employee> showSortedEmployees(@RequestParam("order") String order) {
		if(order.equals("asc")) {
			return employeeService.getAllEmployeesInOrder(Direction.ASC);
		} else if(order.equals("desc")) {
			return employeeService.getAllEmployeesInOrder(Direction.DESC);
		}
		return null;
	}
}
