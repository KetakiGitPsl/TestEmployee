package com.psl.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.Employee.dao.IEmployeeDAO;
import com.psl.Employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
