package com.psl.mytest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
//import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.psl.Employee.entity.Employee;
import com.psl.Employee.service.IEmployeeService;


@RunWith(value=SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes={EmployeeTestConfig.class})
@ContextConfiguration(locations = "EmployeeServiceTest-context.xml")
public class EmployeeServiceTest {
	
	@Autowired
	private IEmployeeService service;
	
	

//	@Before
//	public void setUp(){
//		service = new EmployeeServiceStub();
//	}



	@Test
	public void getAllEmployeesTest(){
		System.out.println("Here");
		List<Employee> list = service.getAllEmployees();
		for (Employee employee : list) {
			System.out.println("~" + employee.getName());
		}
		System.out.println("size =  " + list.size());
		Assert.assertEquals(15, list.size()); 
		
		
	}
	
	@Test
	public void getOneEmployeesTest(){
		List<Employee> list = service.getAllEmployees();
		for (Employee employee : list) {
			if(employee.getId() == 2)
				Assert.assertEquals("John", employee.getName()); 
		}
		
	}
	
}
