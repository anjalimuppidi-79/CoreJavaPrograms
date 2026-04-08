package com.conditional.whileloops;

public class NumberSum {

	public static void main(String[] args) {
		int n = 234567986;
		int r = 0;
		int sum = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;

		}
		System.out.println("count of a given number:" + sum);

	}

}
