package com.conditional.whileloops;
//input:19->1^2+9^2=82

//8^2+2^2=68
//6^2+8^2=100
//1^2+0^2+0^2=1---until single digit

public class HappyNumber {

	public static void main(String[] args) {
		int num = 19;
		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				int r = num / 10;// 9 1
				sum = sum + (r * r);
				num = num / 10;
			}
			num = sum;
		}
		if (num == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}

	}

}
