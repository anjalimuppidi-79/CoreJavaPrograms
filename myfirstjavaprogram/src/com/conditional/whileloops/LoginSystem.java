package com.conditional.whileloops;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		int attempts = 0;
		String user = "Java";
		String pass = "Java@321";
		Scanner sc = new Scanner(System.in);

		while (attempts < 3) {
			System.out.println("Enter your Username:");
			String userName = sc.next();
			System.out.println("Enter your Password:");
			String password = sc.next();

			if (user.equalsIgnoreCase(userName) && pass.equals(password)) {
				System.out.println("Login Success");
				break;
			} else {
				System.out.println("Invalid Credentials!!");
				attempts++;
			}
		}
		if (attempts == 3) {
			System.out.println("Account locked!!");
		}
		sc.close();

	}

}
