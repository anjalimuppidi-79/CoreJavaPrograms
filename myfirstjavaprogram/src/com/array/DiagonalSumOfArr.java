//1 2 3
//4 5 6
//7 8 9
//left diagonal sum =15
//right diagonal sum =15
package com.array;

public class DiagonalSumOfArr {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				// Left diagonal
				if (i == j) {// 00 11 22
					leftSum += arr[i][j];
				}

				// right diagonal
				if (i + j == arr.length - 1) {// 02 11 20
					rightSum += arr[i][j];
				}
			}

		}
		System.out.println("left diagonal sum: " + leftSum);

		System.out.println("Right diagonal sum: " + rightSum);

	}

}
