package com.conditional.whileloops;

public class NeonNumber {

	public static void main(String[] args) {
		int num = 9;
		int sqr = num * num;// 81
		int sum = 0;
		int r = 0;
		while (sqr > 0) {
			r = sqr % 10;
			sum = sum + r;
			sqr = sqr / 10;
		}
		if (sum == num) {
			System.out.println("Given number is neon Number:");
		} else {
			System.out.println("give number is not neon number");
		}
	}

}
