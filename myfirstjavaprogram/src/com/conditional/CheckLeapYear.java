//23-03-2026
/*Write a Java program to check whether a given year is a leap year or not. Check your program using the 
following years: 2100, 1900, 2400*/
/*
 * import java.util.Scanner;
 * 
 * public class CheckLeapYear {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in); System.out.println("Enter year:"); int
 * year = sc.nextInt(); sc.close(); if ((year % 4 == 0 && year % 100 != 0) ||
 * (year % 400 == 0)) { System.out.println("This Year is a leap Year!!!");
 * 
 * } else System.out.println("This is not a leap Year!!");
 * 
 * }
 * 
 * }
 */
package com.conditional;


public class CheckLeapYear {

	public static void main(String[] args) {
		int year = 2000;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 00) {
					System.out.println("This is a leap year!!");
				} else {
					System.out.println("Not Leap Year");
				}
			} else {
				System.out.println("Leap Year");
			}
		} else {
			System.out.println("Not Leap Year");
		}

	}
}
