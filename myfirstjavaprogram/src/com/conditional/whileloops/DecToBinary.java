package com.conditional.whileloops;

public class DecToBinary {

	public static void main(String[] args) {
		int num = 18;
		int temp = num;
		String binary = "";
		while (num > 0) {
			int r = num % 2;
			binary = r + binary;
			num = num / 2;
		}
		System.out.println(temp + " is written in binary number as:" + binary);

	}

}
