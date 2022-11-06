package com.greatlearning.group.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.group.employeemanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
}
