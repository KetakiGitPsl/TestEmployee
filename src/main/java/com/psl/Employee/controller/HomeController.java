package com.psl.Employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.psl.Employee.entity.Employee;
import com.psl.Employee.service.IEmployeeService;
    
//this is the home controllerrrr      

@Controller
public class HomeController {
	  
	@Autowired         //      
	private IEmployeeService service;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		System.out.println("this is home controller     ");
		//List<Employee> list = service.getAllEmployees();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		//mav.addObject("list", list);
		return mav;
	}
}
