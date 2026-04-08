/*//24-03-2026
//Calculator using switch

👉 Take 2 numbers + operator (+, -, *, /) → print result

  package com.conditional.switchcase;
  
  import java.util.Scanner;
  
  public class OperatorUsingSwitchCase {
  
  public static void main(String[] args) { Scanner sc = new Scanner(System.in);
  System.out.println("enter a value:"); int a = sc.nextInt();
  System.out.println("enter b value:"); int b = sc.nextInt();
  System.out.println("Enter a operator to perform caluculation:"); String
  operator = sc.next();
  
  switch (operator) {
  
  case "+" -> { System.out.println("addition: "); System.out.println(a + b);
  
  } case "-" -> { System.out.println("Subtraction: "); System.out.println(a -
  b); } case "*" -> { System.out.println("Multiplication ");
  System.out.println(a * b);
  
  } case "/" -> { System.out.println("Division with quotient ");
  System.out.println(a / b);
  
  } case "%" -> { System.out.println("Modulus with remainder");
  System.out.println(a % b);
  
  } default -> System.out.println("Invalid operator"); }
  
  sc.close(); }
  
  }
  */
//with do-while and using switch case:
package com.conditional.switchcase;

import java.util.Scanner;

public class OperatorUsingSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String yesNO;
		do {
			System.out.println("enter a value:");
			int a = sc.nextInt();
			System.out.println("enter b value:");
			int b = sc.nextInt();
			System.out.println("Enter a operator to perform caluculation:");
			String operator = sc.next();
			switch (operator) {

			case "+" -> {
				System.out.println("addition: ");
				System.out.println(a + b);

			}
			case "-" -> {
				System.out.println("Subtraction: ");
				System.out.println(a - b);
			}
			case "*" -> {
				System.out.println("Multiplication ");
				System.out.println(a * b);

			}
			case "/" -> {
				System.out.println("Division with quotient ");
				System.out.println(a / b);

			}
			case "%" -> {
				System.out.println("Modulus with remainder");
				System.out.println(a % b);

			}
			default -> System.out.println("Invalid operator");
			}
			System.out.println("Do you want to procedd click Y or n ..?:");
			yesNO = sc.next();
		} while (yesNO.equalsIgnoreCase("y"));
		sc.close();
	}
}
