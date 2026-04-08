//06-04-2026
//WAP swapping two numbers without using 3rd variable

//3. (Best) Swapping Without Third Variable – XOR Method
package com.javapractice;

public class BestWaySwapping {

	public static void main(String[] args) {
		int a = 98746;
		int b = 45899645;
		System.out.println("Before swapping a value is:" + a + "  and b value is:  " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping a value is:" + a + "  and b value is:  " + b);

	}

}
/*
 * Interview
 * 
 * "Swapping can be done without a third variable using arithmetic operations 
 * or XOR, but XOR is safer as it avoids overflow."
 */