package com.employee.service;

import java.net.ResponseCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service 
public class EmployeeService {
	@Autowired
	private EmployeeRepository emp;
	
	public ResponseEntity<String> saveEmployee(Employee employee){
		     emp.save(employee);
		return new ResponseEntity<String>("employee saved",HttpStatus.CREATED);
	}
	
	public ResponseEntity<Employee> saveEmployee2(Employee employee){
	     emp.save(employee);
	return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
}
	

}
