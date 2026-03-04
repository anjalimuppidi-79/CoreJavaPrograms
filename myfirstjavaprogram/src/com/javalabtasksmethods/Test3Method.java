package com.javalabtasksmethods;
//25-02-2026

/*
Requirements Covered:
✔ Two static methods with parameters and no return type
✔ One static method calling another static method
✔ Two instance methods with parameters and no return type
✔ One instance method calling another instance method
✔ Static method creating object to call instance methods
✔ All methods executed in sequence
*/

public class Test3Method {

	// ================= MAIN METHOD =================
	public static void main(String[] args) {

		System.out.println("Main method started...\n");

		// Calling first static method
		addition(10, 20);

		System.out.println("\nMain method ended...");
	}

	// ================= STATIC METHOD - 1 =================
	// Performs addition and calls another static method
	static void addition(int a, int b) {

		int result = a + b;
		System.out.println("Addition Result: " + result);

		// Calling second static method
		subtraction(result, 5);
	}

	// ================= STATIC METHOD - 2 =================
	// Performs subtraction and creates object to call instance method
	static void subtraction(int a, int b) {

		int result = a - b;
		System.out.println("Subtraction Result: " + result);

		// Creating object to call instance methods
		Test3Method obj = new Test3Method();

		// Calling first instance method
		obj.multiplication(result, 2);
	}

	// ================= INSTANCE METHOD - 1 =================
	// Performs multiplication and calls another instance method
	void multiplication(int a, int b) {

		int result = a * b;
		System.out.println("Multiplication Result: " + result);

		// Calling second instance method (directly allowed)
		division(result, 4);
	}

	// ================= INSTANCE METHOD - 2 =================
	// Performs division
	void division(int a, int b) {

		int result = a / b;
		System.out.println("Division Result: " + result);
	}
}