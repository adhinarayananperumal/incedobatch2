package com.icici.sharemarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.sharemarket.pojo.EmployeePojo;
import com.icici.sharemarket.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/getEmployee", produces = "application/json")
	public EmployeePojo getEmployees() {
		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setEmployeeName("Ravi");
		return employeePojo;
	}

	@PostMapping(path = "/createEmpReg", consumes = "application/json", produces = "application/json")
	public EmployeePojo createEmpReg(@RequestBody EmployeePojo employeepojo) {
		System.out.println(employeepojo.getEmployeeName());
		System.out.println(employeepojo.getAge());
		employeeService.saveEmployee(employeepojo);
		return employeepojo;
	}

	@GetMapping(path = "/getEmp/{id}", produces = "application/json")
	public EmployeePojo getemp(@PathVariable Integer id) {

		EmployeePojo employeePojo = employeeService.getEmployee(id);
		return employeePojo;
	}
	
	@GetMapping(path = "/listEmp", produces = "application/json")
	public EmployeePojo listEmp() {

		EmployeePojo employeePojo = employeeService.listEmployee();
		return employeePojo;
	}

	
	@PutMapping(path = "/updateEmp", consumes = "application/json", produces = "application/json")
	public EmployeePojo updateEmp(@RequestBody EmployeePojo employeepojo) {
		employeeService.editEmployee(employeepojo);
		employeepojo= employeeService.getEmployee(employeepojo.getEmpId());
		return employeepojo;
	}

	@DeleteMapping(path = "/deleteEmp/{empId}", produces = "application/json")
	public EmployeePojo deleteEmp(@PathVariable Integer empId) {
		EmployeePojo employeePojo = employeeService.deleteEmployee(empId);
		return employeePojo;
	}
	
	
}
