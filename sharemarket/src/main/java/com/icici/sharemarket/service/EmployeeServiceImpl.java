package com.icici.sharemarket.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icici.sharemarket.entity.Employee;
import com.icici.sharemarket.pojo.EmployeePojo;
import com.icici.sharemarket.repository.EmployeeRepository;



@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeePojo getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePojo saveEmployee(EmployeePojo employeePojo) {
		// sending email
		// sending sms
		// generating employee id
		// chek for enough bank balance to transfer
		System.out.println("From Service .........." + employeePojo.getEmployeeName());
		
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeePojo.getEmployeeName());
		employee.setAge(employeePojo.getAge());
		
		employeeRepository.save(employee);
		
		employeePojo.setEmpId(employee.getEmpId());
		
		// call dao or repository
		return employeePojo;
	}

	@Override
	public EmployeePojo deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePojo editEmployee(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeePojo> listEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeePojo> getEmployeeByNameWithLike(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

}
