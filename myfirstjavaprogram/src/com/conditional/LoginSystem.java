//23-03-2026
/*🧠 Q10 (Login System – Nested if)

👉 Input:

username correct or not
password correct or not

👉 Output:

Username wrong
Password wrong
Login success*/

package com.conditional;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		/* String user_Name = "Java_123"; */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String user_Name = sc.nextLine();
		if (user_Name.equals("Java_123")) {
			/* String password = "Java@321"; */
			System.out.println("UserName is Correct!!");
			System.out.println("Enter Password:");
			String password = sc.nextLine();
			if (password.equals("Java@321")) {
				System.out.println("Password is correct!!");
				System.out.println("Login Success");
			} else {
				System.out.println("Password wrong");
			}
		} else {
			System.out.println("Username Wrong!!");
		}
		sc.close();
	}

}
