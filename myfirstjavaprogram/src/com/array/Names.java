package com.array;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter names:");
		for (int i = 0; i < size; i++) {
			names[i] = sc.next();

		}
		for (int i = 0; i < size; i++) {
			System.out.println(names[i]);
		}
		for (String s : names) {
			if (s.toLowerCase().startsWith("m") || s.endsWith("a")) {
				System.out.println(s);
			}
		}

		sc.close();
	}

}
