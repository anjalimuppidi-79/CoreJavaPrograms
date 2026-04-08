package com.conditional.loops;

public class DecToBin {

	public static void main(String[] args) {
		int num = 18;
		int temp = num;
		String bin = "";
		for (; num > 0; num = num / 2) {
			int r = num % 2;
			bin = r + bin;
		}
		System.out.println("The given  decimal number is binary number:" + bin);
	}

}
