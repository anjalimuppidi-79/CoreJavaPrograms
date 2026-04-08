//30-03-3026
//write a program to check whether a given number is prime or not
package com.conditional.loops;

import java.util.Scanner;

public class PrimeNumber {
	static boolean isPrime(int num) {
		boolean status = true;

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
			
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		boolean result = isPrime(num);

		if (result) {
			System.out.println("It s a Prime Number");
		} else {
			System.out.println("It is not a prime number");
		}

		sc.close();

	}

}
