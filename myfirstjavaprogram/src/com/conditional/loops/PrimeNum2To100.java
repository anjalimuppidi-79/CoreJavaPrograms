//30-03-2026
//WAP to print 1 to 100 prime numbers check weather given number is prime r not

package com.conditional.loops;

public class PrimeNum2To100 {
	static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;

			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("Printing prime Numbers:");

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");

			}
		}

	}

}
