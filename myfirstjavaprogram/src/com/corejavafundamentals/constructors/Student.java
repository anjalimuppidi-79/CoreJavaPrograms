//03-03-2026
package com.corejavafundamentals.constructors;

public class Student {
	int id;
    String name;

    // No-Args Constructor
    Student() {
        id = 0;
        name = "Unknown";
        System.out.println("No-Args Constructor Called");
    }

    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
    }

	public static void main(String[] args) {
		 Student s1 = new Student();
	        Student s2 = new Student(101, "Anjali");

	        System.out.println(s1.id + " " + s1.name);
	        System.out.println(s2.id + " " + s2.name);
	    

	}

}
