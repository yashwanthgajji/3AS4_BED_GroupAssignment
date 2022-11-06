package com.greatlearning.group.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.group.employeemanagement.model.Employee;
import com.greatlearning.group.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee =  employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Deleted employee id - " + id;
	}
	
	@Override
	public List<Employee> getAllEmployeesByFirstName(String firstName) {
		Employee employeeWithGivenFirstNameLibrary = new Employee();
		employeeWithGivenFirstNameLibrary.setFirstname(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("firstname", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("lastname", "email","id");
		Example<Employee> example = Example.of(employeeWithGivenFirstNameLibrary, exampleMatcher);
		return employeeRepository.findAll(example);
	}
	
	@Override
	public List<Employee> getAllEmployeesInOrder(Direction direction) {
		return employeeRepository.findAll(Sort.by(direction, "id"));
	}
	
}
