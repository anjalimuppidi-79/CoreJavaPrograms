//01-04-2026
//WAP to count digits in a number

package com.conditional.whileloops;

public class NumberCount {

	public static void main(String[] args) {
		int n = 234567986;
		int r=0;
		int count = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			count++;
		}
		System.out.println("count of a given number:" + count);

	}

}
