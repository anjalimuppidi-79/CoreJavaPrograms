//22-03-2026
/*Question: Age Classification Program
Write a Java program that reads a person's age from the user and classifies them into different categories based
 on the following conditions
If the age is 0 to 5 years → Print "You are a Kid"
If the age is 6 to 12 years → Print "You are a Child"
If the age is 13 to 19 years → Print "You are a Teen"
If the age is 20 to 35 years → Print "You are Young"
If the age is 36 to 60 years → Print "You are Middle Age"
If the age is greater than 60 years → Print "You are a Senior Citizen"
👉 Additionally:
If the entered age is negative, display "Invalid Age"*/

package com.conditional;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if (age <= 0) {
		    System.out.println("Invalid age");
		}else if (age <= 5) {
			System.out.println("You are a kid!!");
		} else if (age <= 12) {
			System.out.println("You are a Child!!");
		} else if (age <= 19) {
			System.out.println("You are a Teen!!");
		} else if (age <= 35) {
			System.out.println("You are a Young!!");
		} else if (age <= 60) {
			System.out.println("You are a Middle age!!");
		} else {
			System.out.println("You are a Senior Citizen!!");
		}

		sc.close();
	}

}
