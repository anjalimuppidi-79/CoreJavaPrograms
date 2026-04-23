
//Find duplicate elements
//arr[]={10,20,30,10,40,20}
//o/p:10,20
package com.array;

import java.util.Scanner;

public class DuplicateElem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		System.out.println("Enter elements into an array:");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int count=0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					//System.out.println(arr[i]);
					count++;
				}
			}
			if(count>0) {
				System.out.print(arr[i]+" ");
			}
		}

		sc.close();
	}

}
