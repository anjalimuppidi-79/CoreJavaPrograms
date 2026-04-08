//30-03-2026
//WAP to print sum of first to ten numbers
package com.conditional.loops;

public class SumOfFirst10Numbers {
	static void sumOfNumbers() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;

		}
		System.out.println("sum of 1 to 10 numbers:" + sum);

	}

	public static void main(String[] args) {
		sumOfNumbers();

	}

}
