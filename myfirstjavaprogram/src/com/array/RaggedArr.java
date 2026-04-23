package com.array;

import java.util.Scanner;

public class RaggedArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();

		int[][] ragged = new int[rows][];

		// taking different sizes for each row
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter size of row:");
			int cols = sc.nextInt();
			ragged[i] = new int[cols];

			System.out.println("enter elements for row:");
			for (int j = 0; j < cols; j++) {
				ragged[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < ragged.length; i++) {
			for (int j = 0; j < ragged[i].length; j++) {
				System.out.print(ragged[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
