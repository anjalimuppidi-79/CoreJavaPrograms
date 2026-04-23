//2. Write a Java program to Transpose a Matrix 
//    input : 1 2 3
//            4 5 6 
//      output : 1 4
//               2 5
//               3 6

package com.array;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Print original matrix
		System.out.println("Original Matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// Transpose logic
		System.out.println("Transpose Matrix:");
		for (int i = 0; i < arr[0].length; i++) {// columns becomes rows
			for (int j = 0; j < arr.length; j++) {// rows becomes columns
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

}
