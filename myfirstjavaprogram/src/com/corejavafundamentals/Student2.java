package com.corejavafundamentals;

//Student info details included in info is student name,student id,student age,student each subject marks,sum of all sub marks
//average of the all sub marks
//print the two students details using instance() method.
//Create a Java program to store and display student information.
//The details should include student name, student ID, student age, marks in each subject, total (sum) of
// all subject marks, and the average of the marks.Use an instance method to calculate and print the details.
//   Print the information for two students.   
public class Student2 {
	String st_name;
	int st_id;
	int st_age;
	char gender;
	int st_telugumarks;
	int st_englishmarks;
	int st_hindimarks;
	int st_mathmarks;
	int st_sciencemarks;
	int st_socialmarks;
	int total_marks;
	float average_marks;

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.st_name = "Advith";
		s1.st_id = 123;
		s1.st_age = 20;
		s1.gender = 'M';
		s1.st_telugumarks = 24;
		s1.st_englishmarks = 23;
		s1.st_hindimarks = 20;
		s1.st_mathmarks = 25;
		s1.st_sciencemarks = 25;
		s1.st_socialmarks = 24;
		s1.total_marks = s1.st_telugumarks + s1.st_englishmarks + s1.st_hindimarks + s1.st_mathmarks
				+ s1.st_sciencemarks + s1.st_socialmarks;
		s1.average_marks = s1.total_marks / 6.0f;
		Student2 s2 = new Student2();

		s2.st_name = "Laddu";
		s2.st_id = 144;
		s2.st_age = 21;
		s2.gender = 'F';
		s2.st_telugumarks = 20;
		s2.st_englishmarks = 25;
		s2.st_hindimarks = 22;
		s2.st_mathmarks = 25;
		s2.st_sciencemarks = 21;
		s2.st_socialmarks = 24;
		s2.total_marks = s2.st_telugumarks + s2.st_englishmarks + s2.st_hindimarks + s2.st_mathmarks
				+ s2.st_sciencemarks + s2.st_socialmarks;
		s2.average_marks = s2.total_marks / 6.0f;

		s1.display();
		s2.display();

	}

	void display() {
		System.out.println("------Student2 Info-----");
		System.out.println("Student Name:" + st_name);
		System.out.println("Student Id:" + st_id);
		System.out.println("Student age:" + st_age);
		System.out.println("Gender:" + gender);
		System.out.println("Telugu Marks:" + st_telugumarks);
		System.out.println("Hindi Marks:" + st_hindimarks);
		System.out.println("English Marks:" + st_englishmarks);
		System.out.println("Maths Marks:" + st_mathmarks);
		System.out.println("Science Marks:" + st_sciencemarks);
		System.out.println("social Marks:" + st_socialmarks);
		System.out.println("Total Marks:" + total_marks);
		System.out.println("Average Marks:" + average_marks);

	}

}
