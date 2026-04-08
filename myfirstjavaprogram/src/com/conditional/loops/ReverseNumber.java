package com.conditional.loops;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int rev = 0;
		for (; num > 0; num = num / 10) {// already initialized
			int digit = num % 10; // get last digit
			rev = rev * 10 + digit; // build reverse
		}

		System.out.println("Reversed number: " + rev);
	}
}