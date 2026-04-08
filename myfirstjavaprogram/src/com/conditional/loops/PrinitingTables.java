//30-03-2026
//WAP to print Tables

package com.conditional.loops;

import java.util.Scanner;

public class PrinitingTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to return that  table:");
		int n = sc.nextInt();
		System.out.println("Enter a number upto which range u need:");
		int num = sc.nextInt();
		System.out.println("Print " + n + " table:");
		for (int i = 1; i <= num; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));

		}

		sc.close();

	}

}
