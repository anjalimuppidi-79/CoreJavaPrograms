package com.array;

public class PrimeNumbers {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int n : num) {
			boolean flag = true;
			if (n <= 1) {
				flag = false;
			} else {
				for (int i = 2; i <= n / 2; i++) {
					if (n % i == 0) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("Prime Numbers are: " + n);
			}
		}

	}

}
