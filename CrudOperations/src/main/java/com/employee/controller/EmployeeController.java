package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
private EmployeeService service;
	@PostMapping("/save1")
	public ResponseEntity<String> saveEmp(@RequestBody Employee emp){
		return service.saveEmployee(emp);
		
	}
	
	@PostMapping("/save2")
	public ResponseEntity<Employee> saveEmp2(@RequestBody Employee emp){
		return service.saveEmployee2(emp);
		
	}

}
