package com.greatlearning.group.employeemanagement.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.group.employeemanagement.model.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(Long id);
	public List<Employee> getAllEmployees();
	public void addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Long id);
	public List<Employee> getAllEmployeesByFirstName(String firstName);
	public List<Employee> getAllEmployeesInOrder(Direction direction);
}
