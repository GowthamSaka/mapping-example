package com.onetomany.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
