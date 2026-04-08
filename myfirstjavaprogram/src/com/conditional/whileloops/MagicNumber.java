//1.Write a Java program to check whether a number is a Magic Number or not.
//Input:1729
//Output:magic number
//1 + 7 + 2 + 9 = 19  
//1 + 9 = 10  
//1 + 0 = 1 

package com.conditional.whileloops;

public class MagicNumber {

	public static void main(String[] args) {
		int num = 1729;

		while (num > 9) {// to run loop until getting a single value
			int sum = 0;

			while (num > 0) {
				int r = num % 10;// 1 9
				sum = sum + r;// 10
				num = num / 10;// 1 0
			}
			num = sum;

		}
		System.out.println(num == 1 ? "magic number" : "not magic number");

	}

}
