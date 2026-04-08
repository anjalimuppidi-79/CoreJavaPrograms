//06-04-2026
//WAP to print HCF

package com.javapractice;

public class HighestCommonFactor {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int c = 24;
		int hcf = 1;
		for (int i = 1; i <= a && i <= b && i <= c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				hcf = i;
			}
		}
		System.out.println("The HCF of " + a + "," + b + "," + c + " is: " + hcf);

	}

}
	