package com.conditional.loops;

import java.util.Scanner;

public class FactorsAndPerfectNo {
	int n;

	static void getFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
		int sum = 0;

		for (int i = 1; i <= n/2; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		if (sum == n) {
			System.out.println("It is perfect number!!");
		} else
			System.out.println("It is not a perfect number!!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		getFactors(n);

		sc.close();

	}

}
