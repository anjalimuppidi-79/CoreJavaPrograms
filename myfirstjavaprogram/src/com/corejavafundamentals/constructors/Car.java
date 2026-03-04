//04-03-2026
/*2️) Default Constructor Observation
Problem
Create a class Car with variables:
model,price,mileage
Do not write any constructor.
Create an object and print all values.
👉 Explain why values appear as null or 0.*/

package com.corejavafundamentals.constructors;

//Instance variables
public class Car {
	String model;
	double price;
	double mileage;

	public static void main(String[] args) {
		// object creation
		Car obj = new Car();
		// Since we did not initialize variables,
		// JVM assigns default values
		System.out.println(obj.model);// null
		System.out.println(obj.price);// 0.0
		System.out.println(obj.mileage);// 0.0
		/*
		 * Explanation: - model → null (default for reference types) - price → 0.0
		 * (default for double) - mileage → 0.0
		 * 
		 * Because we did not create any constructor, Java compiler automatically
		 * provides a DEFAULT CONSTRUCTOR.
		 */

	}

}
