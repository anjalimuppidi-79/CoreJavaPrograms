package com.conditional.whileloops.dowhile;

import java.util.Scanner;

public class BasicCaluculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter a value:");
			int a = sc.nextInt();
			System.out.println("Enter b value:");
			int b = sc.nextInt();
			System.out.println("Enter a operator to perfor operations:");
			String oper = sc.next();
			switch (oper) {
			case "+" -> System.out.println("Addition:" + (a + b));
			case "-" -> System.out.println("Subtraction:" + (a + b));
			case "*" -> System.out.println("Mltiplication:" + (a + b));
			case "%" -> System.out.println("Floor Division to get output as reminder:" + (a + b));
			}
			System.out.println("To perform more operation enter (y/n):");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		sc.close();

	}

}
