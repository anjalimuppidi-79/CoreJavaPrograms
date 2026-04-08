
//11-mar-2026
/*1️⃣ Student Details Copy
Create a Java class Student with the following attributes:
studentId
studentName
marks
Requirements:
Create a parameterized constructor to initialize the values.
Create a copy constructor that copies the values from another Student object.
Create a method display() to print student details.
In main(), create one object and use the copy constructor to create another object.*/

package com.corejavafundamentals.constructors;

public class Student4 {
	int studentId;
	String studentName;
	int marks;

	Student4(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;

	}

	Student4(Student4 s) {
		this.studentId = s.studentId;
		this.studentName = s.studentName;
		this.marks = s.marks;

	}

	void displayDetails() {
		System.out.println("student id:" + studentId);
		System.out.println("student name:" + studentName);
		System.out.println("student marks:" + marks);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		Student4 s1 = new Student4(1, "Advith", 25);
		Student4 s2 = new Student4(s1);
		s1.displayDetails();
		s2.displayDetails();

	}

}
