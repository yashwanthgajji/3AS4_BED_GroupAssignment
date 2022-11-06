package com.greatlearning.group.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.group.employeemanagement.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
