//Date:04-03-2026
/*️4) No-Args Constructor for Default Student Data
Problem
Create a class Student with variables:
name,rollNo,course
Create a no-args constructor that assigns:
name = "Unknown";
rollNo = 0;
course = "Not Assigned";
Create a display method.*/
package com.corejavafundamentals.constructors;

public class Student2 {
	String name;
	int rollNo;
	String course;

	// No-Args Constructor
	Student2() {
		// Assigning default values manually
		name = "Unknown";
		rollNo = 0;
		course = "Not Assigned";
	}

	void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(course);

	}

	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.display();

	}

}
