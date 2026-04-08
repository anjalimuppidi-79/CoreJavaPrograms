package com.conditional.loops;

import java.util.Scanner;
//recursive means calling same method in that method 

public class RecursiveFact {

	static int fact(int n) {// n=5
		if (n == 1) {
			return 1;// if n=1 return 1 and stops here
		}
		return n * fact(n - 1);// 5*4*3*2*1
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int f = fact(n);
		System.out.println("factorical of given number is : " + f);

		sc.close();
	}

}
