package com.ibanking.java8concept.functionalinterfaceexp.optionalexp;

import java.util.Optional;

public class EmployeeImplClient {

	public static void main(String[] args) {

		EmployeeManagementImpl employeeManagementImpl = new EmployeeManagementImpl();

		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setEmpName("ravi");
		employeePojo.setAge((byte) 21);

		Optional<EmployeePojo> employeePojoObj = employeeManagementImpl.saveEmployee(employeePojo);
		
		
		employeePojoObj = Optional.ofNullable(employeePojoObj).orElse(Optional.of(new EmployeePojo()));

		
		/*
		 * if(employeePojo !=null) { System.out.println(employeePojo.getEmpId());
		 * System.out.println(employeePojo.getEmpName());
		 * System.out.println(employeePojo.getStatus());
		 * 
		 * if(employeePojo.getStatus()==('s')) {
		 * System.out.println("Employee Saved Successfully......................"); }
		 * 
		 * }else { System.out.println("Some error"); }
		 */

		if (employeePojoObj.isPresent()) {
			System.out.println(employeePojo.getEmpId());
			System.out.println(employeePojo.getEmpName());
			System.out.println(employeePojo.getStatus());

			if (employeePojo.getStatus() == ('s')) {
				System.out.println("Employee Saved Successfully......................");
			}

		} else {
			System.out.println("Some error");
		}

		employeePojoObj.ifPresent(emp -> System.out.println(emp.getEmpId()));

		String name = "tttt";

		System.out.println(name.length());
		
		String ee = null;
	    Optional<String> empty2 = Optional.empty();
	    if(ee!=null) {
	    System.out.println(ee.getBytes());
	    }
	   
	    empty2.ifPresent(name1 -> System.out.println(name));

		
		

	}

}
