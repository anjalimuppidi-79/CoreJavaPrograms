//Input: 	1 2 3 			output:9 2  1
//			4 5 6        		   8 25 12
//			7 8 9                  9 8  49

package com.array;

import java.util.Arrays;

public class LabTask {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		processMatrix(matrix);
		printMatrix(matrix);
	}

	public static void processMatrix(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			// Rule 1: If row index is even -> Reverse the row
			if (i % 2 == 0) {
				reverseRow(matrix[i]);
				// Rule 3: Square diagonal elements (applied after reversal)
				matrix[i][i] = matrix[i][i] * matrix[i][i];
			}
			// Rule 2: If row index is odd -> Double elements
			else {
				for (int j = 0; j < n; j++) {
					// Rule 3: Square diagonal elements
					if (i == j) {
						matrix[i][j] = matrix[i][j] * matrix[i][j];
					} else {
						matrix[i][j] *= 2;
					}
				}
			}
		}
	}

	// Helper method to reverse an array
	public static void reverseRow(int[] row) {
		int left = 0, right = row.length - 1;
		while (left < right) {
			int temp = row[left];
			row[left] = row[right];
			row[right] = temp;
			left++;
			right--;
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}