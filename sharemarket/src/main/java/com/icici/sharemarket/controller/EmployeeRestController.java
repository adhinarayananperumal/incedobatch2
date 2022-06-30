package com.icici.sharemarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.sharemarket.pojo.EmployeePojo;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeRestController {
	
	
	@GetMapping(path="/getEmployee", produces = "application/json")
    public EmployeePojo getEmployees() 
    {
		EmployeePojo employeePojo = new EmployeePojo();    
		employeePojo.setEmployeeName("Ravi");
		return employeePojo;
    }
	
	
	
	@PostMapping(path="/createEmpReg", consumes = "application/json", produces = "application/json")
    public EmployeePojo createEmpReg(@RequestBody EmployeePojo employeepojo) 
    {

		System.out.println(employeepojo.getEmployeeName());
		System.out.println(employeepojo.getAge());

		employeepojo.setEmpId(7800);
		
		return employeepojo;
    }

}
