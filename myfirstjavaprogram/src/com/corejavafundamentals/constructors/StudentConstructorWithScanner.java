//04-03-2026
package com.corejavafundamentals.constructors;

import java.util.Scanner;

/*1) Create a class named Student with the following data members:
name
marks1
marks2
marks3
total
average

Requirements:
The constructor should accept name, marks1, marks2, and marks3 as parameters.
Inside the constructor:
Calculate the total marks.
Calculate the average marks.
Create a method to display all student details.*/
public class StudentConstructorWithScanner {
	String name;
	double engMarks;
	double socMarks;
	double sciMarks;
	double totalMarks;
	double avgMarks;

	StudentConstructorWithScanner() {
		System.out.println("no-arg constructor");

	}

	StudentConstructorWithScanner(String name, double engMarks, double socMarks, double sciMarks) {
		this.name = name;
		this.engMarks = engMarks;
		this.socMarks = socMarks;
		this.sciMarks = sciMarks;
		System.out.println("parameterized constructor");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentConstructorWithScanner s1 = new StudentConstructorWithScanner();
		System.out.println("Enter name");
		s1.name = sc.nextLine();
		System.out.println("enter english marks:");
		s1.engMarks = sc.nextDouble();
		System.out.println("enter science marks:");
		s1.sciMarks = sc.nextDouble();
		System.out.println("enter social marks:");
		s1.socMarks = sc.nextDouble();

		StudentConstructorWithScanner s2 = new StudentConstructorWithScanner(s1.name, s1.engMarks, s1.sciMarks,
				s1.socMarks);
		s2.display();
		sc.close();

	}

	void display() {
		totalMarks = engMarks + socMarks + sciMarks;
		avgMarks = totalMarks / 3;
		System.out.println("Student Name:" + name);
		System.out.println("English Marks:" + engMarks);
		System.out.println("Social Marks:" + socMarks);
		System.out.println("Science Marks:" + sciMarks);
		System.out.println("TotalMarks:" + totalMarks);
		System.out.println("Average Marks:" + avgMarks);

	}

}
