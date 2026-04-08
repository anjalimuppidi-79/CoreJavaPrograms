
//WAP to swap number without using third variable
package com.javapractice;

public class SwappingWhOut3Var {

	public static void main(String[] args) {
		// Program (Method 1: Arithmetic)
		int a = 90;
		int b = 55;
		System.out.println("a value" + a);
		System.out.println("b value" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a value" + a);
		System.out.println("b value" + b);
	}

}
/*
 * ⚠️ Important Note
 * 
 * 👉 This method may cause overflow if numbers are large
 */