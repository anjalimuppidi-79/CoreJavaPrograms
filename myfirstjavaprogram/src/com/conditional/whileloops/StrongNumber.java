//08-04-2026
//strong Number

package com.conditional.whileloops;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int r = num % 10;// 5 //4 //1
			num = num / 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("Strong Number!!");
		} else {
			System.out.println("Not Strong Number!!");
		}

	}

}
