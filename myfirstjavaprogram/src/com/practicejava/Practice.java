package com.practicejava;

public class Practice {

	public static void main(String[] args) {
		int[] n = { 10, 25, 30, 45, 50 };
		for (int num : n) {
			if (num % 2 == 0) {
				System.out.print("Even Numbers:" + num + " ");
			} else {
				System.out.println();
				System.out.print("odd Numbers" + num + " ");
			}
		}
	}
}