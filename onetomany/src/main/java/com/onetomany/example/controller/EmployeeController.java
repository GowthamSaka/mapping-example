package com.onetomany.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.example.model.Employee;
import com.onetomany.example.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/c1")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/saveEmployees")
	public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
		employeeRepository.saveAll(empData);
		return ResponseEntity.ok("Data Added");
	}

}
