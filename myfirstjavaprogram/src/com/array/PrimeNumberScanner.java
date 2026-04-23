package com.array;

import java.util.Scanner;

public class PrimeNumberScanner {
	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("enter elements into an array:");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Prime numbers are:");
		for (int n : num) {
			boolean flag = isPrime(n);
			if (flag) {
				System.out.println(n);
			}
		}
		sc.close();
	}

}
