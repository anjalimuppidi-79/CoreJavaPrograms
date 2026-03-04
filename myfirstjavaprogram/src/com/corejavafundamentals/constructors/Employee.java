////04-03-2026
/*1️) Default Constructor Practice
Problem
Create a class Employee with variables:
empId,empName,salary
Do not write any constructor.
In main():
Create an object of Employee.
Print the values of all variables.*/
package com.corejavafundamentals.constructors;

public class Employee {

	int empId;
	String empName;
	double salary;

	public static void main(String[] args) {

		// Object creation
		Employee obj = new Employee();

		// Printing default values
		System.out.println("Employee Id: " + obj.empId); // 0
		System.out.println("Employee Name: " + obj.empName); // null
		System.out.println("Employee Salary: " + obj.salary);// 0.0

		/*
		 * Since we did not write any constructor, Java compiler automatically provides
		 * a DEFAULT CONSTRUCTOR.
		 * 
		 * Default values assigned by JVM: int → 0 String → null double → 0.0
		 */
	}
}