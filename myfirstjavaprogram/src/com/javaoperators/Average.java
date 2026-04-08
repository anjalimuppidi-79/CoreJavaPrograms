//13-03-2026
/*4. Average of Three Numbers

Write a Java program to calculate the average of three numbers using arithmetic operators.*/

package com.javaoperators;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		double a = sc.nextDouble();
		System.out.println("Enter second number:");
		double b = sc.nextDouble();
		System.out.println("Enter third number:");
		double c = sc.nextInt();
		System.out.println("average of three numbers:" + (a + b + c) / 3.0);
		sc.close();

	}

}
