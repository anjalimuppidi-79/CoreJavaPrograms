/*1️⃣ Student Result System
Create a Java program using multilevel inheritance.
Create a class Student with:studentId
studentName
Initialize them using a constructor.
Create a class Exam that extends Student with:
subject
marks
Create a class Result that extends Exam with:
grade
Implement a display() method to print all student details.
Create an object in main() and display the result.*/
package com.corejavafundamentals.constructors;

class Student1 {
	int studentId;
	String studentName;

	Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
}

class Exam extends Student1 {
	String subject;
	int marks;

	Exam(int studentId, String studentName, String subject, int marks) {
		super(studentId, studentName);
		this.subject = subject;
		this.marks = marks;

	}
}

public class Result extends Exam {

	char grade;

	Result(int studentId, String studentName, String subject, int marks, char grade) {
		super(studentId, studentName, subject, marks);
		this.grade = grade;
	}

	public static void main(String[] args) {
		Result r1 = new Result(1234, "Mohan", "java", 100, 'A');
		r1.display();

	}

	void display() {
		System.out.println("Id of the student:" + studentId);
		System.out.println("Name of the student:" + studentName);
		System.out.println("subject:" + subject);
		System.out.println("Marks of the Student:" + marks);
		System.out.println("Garde of the Student:" + grade);
	}

}
