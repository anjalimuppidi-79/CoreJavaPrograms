package com.conditional.whileloops;

//WAP to convert binary to decimal
//1010--->10
//10010-->18
public class BinToDec {

	public static void main(String[] args) {
		int bin = 10010;
		int temp = bin;
		int dec = 0;
		int base = 1;
		while (bin > 0) {
			int r = bin % 10;
			dec = dec + r * base;
			base = base * 2;
			bin = bin / 10;
		}
		System.out.println(temp + " decimal form is: " + dec);
	}

}
