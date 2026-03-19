//19-03-2026
/*1️⃣ Check Positive Number
Input: 5  
Output: Positive*/
package com.conditional;

import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int num1 = 5;
		if (num > 0) {
			System.out.println("positive Number");
		}
		if (num1 > 0) {
			System.out.println("positive Number");
		}

		sc.close();
	}

}
