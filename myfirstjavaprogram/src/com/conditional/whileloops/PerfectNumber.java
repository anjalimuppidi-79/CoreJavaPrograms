package com.conditional.whileloops;

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 6;
		int i = 1;
		int sum = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum == n ? n + " is a perfect number " : n + " is not perfect number ");

	}

}
