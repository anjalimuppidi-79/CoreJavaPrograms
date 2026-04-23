package com.array;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2,3, 4 };
		int missing = 0;
		int sum = 0;
		int sumOfFiveNum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		// finding sum of 1st 5 numbers
		int n = arr.length + 1;
		for (int i = 0; i <= n; i++) {
			sumOfFiveNum = n * (n + 1) / 2;
		}
		missing = sumOfFiveNum - sum;

		System.out.println(missing);
	}
}
