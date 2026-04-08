//30-03-2026
//WAP to check the given number is perfect number r not

package com.conditional.loops;

import java.util.Scanner;

public class OptimizedPerfectNo {
	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % 1 == 0) {
				sum = sum + i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		if (isPerfect(num)) {
			System.out.println(num + " is a perfect number!! ");
		} else {
			System.out.println(num + " is not a perfect number!!!");
		}

		sc.close();

	}

}
