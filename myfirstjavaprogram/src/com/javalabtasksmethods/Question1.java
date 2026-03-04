//26-02-2026

package com.javalabtasksmethods;

public class Question1 {

	public static void m1(int firstValue) {

		System.out.println(firstValue);
		m2(firstValue, 30);

	}

	public static void m2(int val1, int val2) {

		int sum = val1 + val2;
		System.out.println(sum);
	}

	public static void main(String[] args) {

		m1(20);

	}
}
