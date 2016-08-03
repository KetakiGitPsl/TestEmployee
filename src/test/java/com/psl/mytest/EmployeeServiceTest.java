package com.psl.mytest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.psl.Employee.entity.Employee;
import com.psl.Employee.service.IEmployeeService;


@RunWith(value=JUnit4ClassRunner.class)
@ContextConfiguration(classes={EmployeeTestConfig.class})
public class EmployeeServiceTest {
	
	
	private IEmployeeService service;
	
	

//	@Before
//	public void setUp(){
//		service = new EmployeeServiceStub();
//	}
	@Autowired
	public void setService(IEmployeeService service) {
		this.service = service;
	}



	@Test
	public void getAllEmployeesTest(){
		System.out.println("Here");
		List<Employee> list = service.getAllEmployees();
		System.out.println("size =  " + list.size());
		Assert.assertEquals(2, list.size()); 
		
		
	}
	
}
