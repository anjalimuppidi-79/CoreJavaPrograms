package com.array;

public class TwoDArray {

	public static void main(String[] args) {
		// declaration of 2D array and creation
		int[][] arr = new int[2][4];// 2 is row //4 is column size
		// 0 1--->0 1 2 4
		System.out.println(arr);//[[I@2b2fa4f7:Address of the array it is in the form of 
		//className@hashcode
		int[] [] arr1= {{}};//valid case means inside curly braces represent row of an array
		System.out.println(arr1);//[[I@1dbd16a6
		System.out.println(arr.length);// it represents the row length//2
		System.out.println(arr[0].length);// 4
		System.out.println(arr[1].length);// 4

		// Initialization
		arr[0][0] = 120;
		arr[0][1] = 121;
		arr[0][2] = 122;
		arr[0][3] = 123;
		arr[1][0] = 124;
		arr[1][1] = 125;
		arr[1][2] = 126;
		arr[1][3] = 127;

		// representation
		// by using for each loop
		/*
		 * for (int[] a1 : arr) { for (int a : a1) { System.out.print(a + " "); }
		 * System.out.println(); }
		 */
		// by using nested for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}
}
