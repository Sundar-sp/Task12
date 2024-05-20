package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setName("sundar");
		obj.setId(113);
		obj.setSalary(10000.0);
		obj.printName();
		obj.printSalary();

	}
	

}

Output:
Name: sundar
Salary: 10000.0
