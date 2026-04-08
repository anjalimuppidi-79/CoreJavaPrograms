package com.corejavafundamentals;
//Employee Name=king,salary 5000(monthly)

//pf=8%,DA=3%,GSt=6%
//find the annual salary after the cuttings and credits
//without creating primitive data types,data shown automatically when an instance is created

public class WrapperObjectDataType {
	String name = "king";
	Double salary = 5000.0;
	Double pf = 8.0;
	Double da = 3.0;
	Double gst = 6.0;
	Double annualSalary;

	public static void main(String[] args) {
		WrapperObjectDataType wrp = new WrapperObjectDataType();

	}

	{
		pf = (5000 * 0.08);
		da = (5000 * 0.03);
		gst = (5000 * 0.06);
		annualSalary = salary - pf + da - gst;
		System.out.println("Employee Name:" + name);
		System.out.println("Salary:" + salary);
		System.out.println("Annual Salary:" + annualSalary);

	}

}
