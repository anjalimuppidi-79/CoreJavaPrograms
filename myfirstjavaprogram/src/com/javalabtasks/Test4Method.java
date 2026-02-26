package com.javalabtasks; // Package name (grouping related classes together)

import java.util.Scanner; // Importing Scanner class to take user input

// Program to find area of Circle, Rectangle, Triangle and Square
// Using methods with return type and with arguments
public class Test4Method {

	// Static method to find area of Circle
	// Takes radius as argument and returns area
	static double getareaofCircle(double r) {
		double areaCircle = Math.PI * r * r; // Formula: π × r²
		return areaCircle; // Returning calculated area
	}

	// Static method to find area of Rectangle
	// Takes length and breadth as arguments and returns area
	static double getAreaOfRectangle(double l, double b) {
		double areaR = l * b; // Formula: length × breadth
		return areaR; // Returning calculated area
	}

	// Instance method to find area of Triangle
	// Takes base and height as arguments and returns area
	double getAreaOfTriangle(double b, double h) {
		double areaTri = 0.5 * b * h; // Formula: ½ × base × height
		return areaTri; // Returning calculated area
	}

	// Instance method to find area of Square
	// Takes side as argument and returns area
	int getAreaOfSquare(int side) {
		int areaSq = side * side; // Formula: side × side
		return areaSq; // Returning calculated area
	}

	public static void main(String[] args) {

		// Creating Scanner object to read input from user
		Scanner sc = new Scanner(System.in);

		// ===== Circle =====
		System.out.println("Enter radius of Circle:");
		double a = sc.nextDouble(); // Reading radius value from user
		double b = getareaofCircle(a); // Calling static method
		System.out.println("Area of the Circle: " + b); // Printing result

		System.out.println("---------------------------------");

		// ===== Rectangle =====
		System.out.println("Enter Length of Rectangle:");
		double c = sc.nextDouble(); // Reading length
		System.out.println("Enter breadth of Rectangle:");
		double d = sc.nextDouble(); // Reading breadth
		double e = getAreaOfRectangle(c, d); // Calling static method
		System.out.println("Area of Rectangle: " + e); // Printing result

		System.out.println("---------------------------------");

		// ===== Triangle =====
		System.out.println("Enter base of Triangle:");
		double f = sc.nextDouble(); // Reading base
		System.out.println("Enter height of Triangle:");
		double g = sc.nextDouble(); // Reading height

		Test4Method t1 = new Test4Method(); // Creating object to call instance method
		double areaTri = t1.getAreaOfTriangle(f, g); // Calling instance method
		System.out.println("Area of Triangle: " + areaTri); // Printing result

		System.out.println("---------------------------------");

		// ===== Square =====
		System.out.println("Enter side of the Square:");
		int h = sc.nextInt(); // Reading side value

		Test4Method t2 = new Test4Method(); // Creating object to call instance method
		int areaSquare = t2.getAreaOfSquare(h); // Calling instance method
		System.out.println("Area of the Square: " + areaSquare); // Printing result

		System.out.println("---------------------------------");

		sc.close(); // Closing scanner to prevent resource leak
	}
}