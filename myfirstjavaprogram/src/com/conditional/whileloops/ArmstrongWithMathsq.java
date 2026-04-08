package com.conditional.whileloops;

public class ArmstrongWithMathsq {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int count = String.valueOf(num).length();
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum += (int) (Math.pow(r, count));
			num = num / 10;
		}
		System.out.println(sum == temp ? "It is ArmStrong!" : "It is not a ArmStrong!");
	}

}
