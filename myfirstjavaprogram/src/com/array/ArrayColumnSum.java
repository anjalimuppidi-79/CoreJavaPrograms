/*2.Write a Java program to find sum of each column.
Input
1 2 3
4 5 6
7 8 9
Output
Column 1 Sum = 12
Column 2 Sum = 15
Column 3 Sum = 18  
*/
package com.array;

public class ArrayColumnSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			count++;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[j][i];
			}
			System.out.println("colunm " + count + " sum " + sum);

		}

	}

}
