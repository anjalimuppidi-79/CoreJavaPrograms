//17-03-2026
//Write a program to show use of all arithmetic operators.
package com.javapractice;

import java.util.Scanner;

public class Arithemetic {
	int a;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		System.out.println("Addition of a and b:" + (a + b));
		System.out.println("Subtraction of a and b:" + (a - b));
		System.out.println("Multiplication of a and b:" + (a * b));
		System.out.println("Division of a and b:" + (a / b));
		System.out.println("Modulus of a and b:" + (a % b));

		sc.close();
	}

}
