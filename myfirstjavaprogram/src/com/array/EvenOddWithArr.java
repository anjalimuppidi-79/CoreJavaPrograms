package com.array;

public class EvenOddWithArr {

	public static void main(String[] args) {
		int[] num = { 10, 15, 20, 25, 30 };

		/*
		 * for (int i = 0; i < num.length; i++) { if (num[i] % 2 == 0) {
		 * System.out.println("Even numbers:" + num[i]); } else if (num[i] % 2 != 0) {
		 * System.out.println("odd NUmbers:" + num[i]);
		 * 
		 * }
		 */
		System.out.println("Even numbers:");
		for (int n : num) {
			if (n % 2 == 0) {
				System.out.println(n + " ");
			}
		}
		System.out.println("Odd numbers:");
		for (int n : num) {
			if (n % 2 != 0) {
				System.out.print(n + " ");
			}   

		}

	}

}
