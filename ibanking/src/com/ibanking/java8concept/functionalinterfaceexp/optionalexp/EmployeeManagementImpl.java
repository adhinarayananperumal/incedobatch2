package com.ibanking.java8concept.functionalinterfaceexp.optionalexp;

import java.util.Optional;
import java.util.Random;

public class EmployeeManagementImpl {

	int generateEmployeeId() {

		Random rd = new Random();

		int empId = rd.nextInt(100000);
		
		return empId;

	}

	Optional<EmployeePojo> saveEmployee(EmployeePojo employeePojo) {
		
		
	    Optional<String> empty = Optional.empty();

	    Optional<EmployeePojo> employeePojoObj = Optional.of(employeePojo);


		int empId = generateEmployeeId();
		// send email
		// send sms
		employeePojo.setStatus('s');
		employeePojo.setEmpId(empId);
		// save to database
		return employeePojoObj;
	}

}
