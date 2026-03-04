//04-03-2026
//without Scanner
package com.corejavafundamentals.constructors;

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
public class Student1Constructor {
	String name;
	double engMarks;
	double socMarks;
	double sciMarks;
	double totalMarks;
	double avgMarks;

	Student1Constructor() {
		System.out.println("no-arg constructor");

	}

	Student1Constructor(String name, double engMarks, double socMarks, double sciMarks) {
		this.name = name;
		this.engMarks = engMarks;
		this.socMarks = socMarks;
		this.sciMarks = sciMarks;
		System.out.println("parameterized constructor");

	}

	public static void main(String[] args) {
		Student1Constructor s1 = new Student1Constructor("Advith", 95, 93, 99);
		s1.display();

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
