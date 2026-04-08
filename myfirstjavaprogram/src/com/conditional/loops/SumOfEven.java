package com.conditional.loops;

public class SumOfEven {

	public static void main(String[] args) {
		int evenSum = 0;
		int evenCount = 0;
		int oddSum = 0;
		int oddCount = 0;
		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				System.out.print(i);
				evenSum = evenSum + i;
				evenCount++;
			}
			if (i % 2 != 0) {
				oddSum = oddSum + i;
				oddCount++;
			}

		}
		System.out.println("The sum of even numbers 1 to 50: " + evenSum);
		System.out.println("The count of even numbers from 1 to 50: " + evenCount);
		System.out.println("The sum of even numbers 1 to 50: " + oddSum);
		System.out.println("The count of even numbers from 1 to 50: " + oddCount);
	}

}
