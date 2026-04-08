package com.corejavafundamentals.constructors;

public class EmployeeDetails {
	int empId;
	String empName;
	double basicSalary;
	double allowances;
	double bonus;
	double overtimepay;

//Default Constructor
	EmployeeDetails() {
		this.empId = 0;
		this.empName = "Unknown";
		this.basicSalary = 0.0;
		this.allowances = 0.0;
		this.bonus = 0.0;
		this.overtimepay = 0.0;
	}

//Parameterized Constructor
	EmployeeDetails(int empId, String empName, double basicSalary, double allowances, double bonus,
			double overtimepay) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.allowances = allowances;
		this.bonus = bonus;
		this.overtimepay = overtimepay;

	}

	// Gross Salary
	double grossSalary() {
		return basicSalary + allowances + bonus + overtimepay;

	}

	// Net Salary
	double netSalary() {
		double totalDeduction = 50000;
		return grossSalary() - totalDeduction;

	}

	// Category Method
	void employeeCategory() {
		double net = netSalary();
		if (net > 600000) {
			System.out.println("High-level category");
		} else if (net > 300000) {
			System.out.println("Medium-level category");
		} else {
			System.out.println("low-level category");
		}

	}

	void displayEmployeeDetails() {
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee basic salary:" + basicSalary);
		System.out.println("Employee allowances:" + allowances);
		System.out.println("Employee bonus:" + bonus);
		System.out.println("Employee overtimepay:" + overtimepay);
		System.out.println("Employee grosssalary:" + grossSalary());
		System.out.println("Employee net salary:" + netSalary());
		employeeCategory();
		System.out.println("***************************************************");

	}

	public static void main(String[] args) {
		System.out.println("main method Started!!");
		EmployeeDetails e1 = new EmployeeDetails();
		EmployeeDetails e2 = new EmployeeDetails(1234, "Anjali", 350000, 20000, 1000, 5000);
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();

	}
}
