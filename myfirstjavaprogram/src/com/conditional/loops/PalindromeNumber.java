package com.conditional.loops;


public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev = 0;
		for (; num > 0; num = num / 10) {// already initialized
			int digit = num % 10; // get last digit
			rev = rev * 10 + digit; // build reverse
		}

		if (temp == rev) {
			System.out.println("It is a Palindrome number");
		} else {
			System.out.println("It is not a Palindrome number");
		}
	}

}
