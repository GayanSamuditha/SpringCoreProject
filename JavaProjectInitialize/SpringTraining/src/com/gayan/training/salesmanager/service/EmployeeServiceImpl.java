package com.gayan.training.salesmanager.service;

import java.util.List;

import com.gayan.training.salesmanager.model.Employee;
import com.gayan.training.salesmanager.repository.EmployeeRepository;
import com.gayan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployees() {	
		return employeeRepository.getAllEmployees();
	}

}
