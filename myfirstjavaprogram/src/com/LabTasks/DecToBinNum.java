//1)Write a program to convert decimal number to binary 
//Input 10
//Without using predefined methods

package com.LabTasks;

import java.util.Scanner;

public class DecToBinNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int input = sc.nextInt();
		String binary = "";

		while (input > 0) {
			int rem = input % 2;// 0 1 0 1
			binary = rem + binary;
			input = input / 2;//
		}
		System.out.println("The binary number for given decimal number is:" + binary);

		sc.close();

	}

}
