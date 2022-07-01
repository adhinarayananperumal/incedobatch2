package com.icici.sharemarket.pojo;

import java.util.ArrayList;
import java.util.List;

import com.icici.sharemarket.entity.Employee;

public class EmployeePojo {

	private int empId;
	private String employeeName;
	private int age;
	private String status;
	

	private List<EmployeePojo> listEmp = new ArrayList<EmployeePojo>();

	public List<EmployeePojo> getListEmp() {
		return listEmp;
	}

	public void setListEmp(List<EmployeePojo> listEmp) {
		this.listEmp = listEmp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
