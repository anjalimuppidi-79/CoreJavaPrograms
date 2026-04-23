// D A B C D

package com.java.patterns;

public class DhoniPattern {

	public static void main(String[] args) {

		char ch = 65;
		char[] ch1 = { 'D', 'H', 'O', 'N', 'I' };

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j || i + j == 6) {
					System.out.print(ch1[i - 1] + " ");
				} else {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();

		}
		System.out.println("*****************************************");
		char ch2 = 65;
		char[] arr = { 'A', 'N', 'J', 'A', 'L', 'I' };
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == j || i + j == 7) {
					System.out.print(arr[i - 1] + " ");
				} else {
					System.out.print(ch2 + " ");
					ch2++;
				}
			}
			System.out.println();

		}

	}

}
