package com.psl.mytest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.psl.Employee.dao.IEmployeeDAO;
import com.psl.Employee.entity.Employee;
import com.psl.Employee.service.IEmployeeService;


public class EmployeeDAOStub implements IEmployeeDAO{

	@Override
	public List<Employee> getAllEmployees() {
		
		System.out.println("In stub");
		List<Employee> eList = new ArrayList<Employee>(); 
		Employee e = new Employee();
		e.setId(1);
		e.setName("ABC");
		
		eList.add(e);
		
		Employee e2 = new Employee();
		e.setId(2);
		e.setName("ABCD");
		
		eList.add(e2);
		
		
		return eList;
	}
	

}
