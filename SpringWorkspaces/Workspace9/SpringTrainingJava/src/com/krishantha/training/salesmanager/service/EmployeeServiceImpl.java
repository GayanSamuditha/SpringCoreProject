package com.krishantha.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overload constructor executed");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeServiceImpl() {
		System.out.println("default constructor executed");
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter executed !");
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
	

}
