//

package com.conditional.whileloops;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int r = 0;
		int rev = 0;

		while (num > 0) {
			r = num % 10;// 3
			num = num / 10;// 12
			rev = rev * 10 + r;
		}
		if (temp == rev) {
			System.out.println("It is a Palindrome Number!!");
		} else {
			System.out.println("It is  not a Palindrome Number!!");
		}

	}

}
