package com.icici.sharemarket.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
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

	EmployeePojo employeePojo = new EmployeePojo();

	@Override
	public EmployeePojo getEmployee(int empId) {
		// TODO Auto-generated method stub
		try {
			Employee employee = employeeRepository.getReferenceById(empId);

			employeePojo.setEmpId(employee.getEmpId());
			employeePojo.setEmployeeName(employee.getEmployeeName());
			employeePojo.setAge(employee.getAge());

		} catch (EntityNotFoundException e) {
			employeePojo.setStatus("Employee Id not found");
		} catch (Exception e) {
			employeePojo.setStatus("Please try again after some time");
		}

		return employeePojo;

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
		
		employeeRepository.deleteById(empId);

		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setEmpId(empId);
		employeePojo.setStatus("ds");
		return employeePojo;
	}

	@Override
	public EmployeePojo editEmployee(EmployeePojo employeePojo) {

		Employee employee = employeeRepository.getReferenceById(employeePojo.getEmpId());

		employee.setEmployeeName(employeePojo.getEmployeeName());

		return employeePojo;
	}

	@Override
	public EmployeePojo listEmployee() {

		EmployeePojo employeePojo = new EmployeePojo();

		List<Employee> listEmployee = new ArrayList();
		List<EmployeePojo> listEmployeePojo = new ArrayList();

		try {
			listEmployee = employeeRepository.findAll();

			for (Employee employee : listEmployee) {
				EmployeePojo employeePojoObj = new EmployeePojo();

				employeePojoObj.setEmpId(employee.getEmpId());
				employeePojoObj.setEmployeeName(employee.getEmployeeName());
				employeePojoObj.setAge(employee.getAge());

				listEmployeePojo.add(employeePojoObj);
			}

			employeePojo.setListEmp(listEmployeePojo);

		} catch (Exception e) {
			employeePojo.setStatus("Please try again after some time");
		}

		return employeePojo;

	}

	@Override
	public List<EmployeePojo> getEmployeeByNameWithLike(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

}
