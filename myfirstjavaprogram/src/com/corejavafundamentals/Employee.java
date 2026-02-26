package com.corejavafundamentals;
//Create a class with Employee--eid,ename,esal;
//create object initialize values
//create a method bonus pass values to method
//add 20% of bonus to the current sal.
public class Employee {
	int eId;
	String eName;
	double currentSal=25000;
	double increment;

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e=new Employee();
		e1.eId=1;
		e1.eName="Anjali";
		e1.currentSal=25000;
		System.out.println("Employee Id:"+e1.eId);
		System.out.println("Employee Name:"+e1.eName);
		System.out.println("Employee Name:"+e1.currentSal);
		e.bonus();
	}
	 void  bonus() {
		 increment=20;
		 increment=(currentSal*(100+increment)/100);
		System.out.println("Increment salary:"+increment);
		
		

	}

}
