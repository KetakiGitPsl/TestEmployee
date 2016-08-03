package com.psl.mytest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psl.Employee.dao.IEmployeeDAO;
import com.psl.Employee.service.EmployeeServiceImpl;
import com.psl.Employee.service.IEmployeeService;

@Configuration
public class EmployeeTestConfig {

	@Bean
	IEmployeeService getService(){
		return new EmployeeServiceImpl();
	}
	
	@Bean
	IEmployeeDAO getDAO(){
		return new EmployeeDAOStub();
	}
}
