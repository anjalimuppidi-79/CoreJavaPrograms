package com.javaintroduction;

// Simple Java program to perform basic arithmetic operations
public class Calculation {

	// Declaration and initialization of static variables
	// These variables are common and can be accessed directly in main method
	static int a = 400;
	static int b = 75;

	public static void main(String[] args) {

		// Addition of a and b
		System.out.println(a + b);

		// Printing sum with a message
		System.out.println("Sum of a, b: " + (a + b));

		// Subtraction of b from a
		System.out.println(a - b);

		// Multiplication of a and b
		System.out.println(a * b);

		// Division of a by b
		System.out.println(a / b);
	}
}
