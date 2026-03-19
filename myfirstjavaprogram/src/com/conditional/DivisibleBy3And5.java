//19-03-2026
/*Question: Check Divisible by 3 and 5

Write a Java program to check whether a number is divisible by both 3 and 5.

Use only if (no else)*/

package com.conditional;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		int num = 15;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Given number is divisible by 3 and 5!!!");
		}
	}

}
