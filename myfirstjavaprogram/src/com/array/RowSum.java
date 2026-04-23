//15-04-2026
// Write a Java program to find sum of each row.
//Input
//1 2 3
//4 5 6
//7 8 9
//Output
//Row 1 Sum = 6
//Row 2 Sum = 15
//Row 3 Sum = 24           
package com.array;

public class RowSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			count++;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println("sum of " + count + " row: " + sum);

		}

	}

}
