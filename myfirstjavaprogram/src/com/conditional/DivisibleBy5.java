//19-03-2026
/*Check Divisible by 5
Input: 25  
Output: Divisible by 5*/

package com.conditional;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int value = sc.nextInt();
		if (value % 5 == 0) {
			System.out.println("Divisible by 5!!");
		}
		
		sc.close();
	}

}
