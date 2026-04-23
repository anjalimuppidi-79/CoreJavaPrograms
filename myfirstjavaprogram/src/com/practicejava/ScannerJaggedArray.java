package com.practicejava;

import java.util.Scanner;

public class ScannerJaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();

		int[][] numbers = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.println("Enter size ofrow:");
			int column = sc.nextInt();
			numbers[i] = new int[column];

			System.out.println("enter elements into rows:");
			for (int j = 0; j < column; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		for (int[] a1 : numbers) {
			for (int a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
