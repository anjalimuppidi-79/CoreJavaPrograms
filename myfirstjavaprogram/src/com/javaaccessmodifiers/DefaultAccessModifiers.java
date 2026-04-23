package com.javaaccessmodifiers;

class DefaultAccessModifiers {

	int id = 1; // default data member
	String name = "Java"; // default data member

	// Default constructor
	DefaultAccessModifiers() {
		System.out.println("Constructor called");
	}

	void display() { // default method
		System.out.println("Method called");
	}

 public static void main(String[] args) {
    DefaultAccessModifiers obj = new DefaultAccessModifiers();
		// ✔ Data members accessible
		System.out.println(obj.id);
		System.out.println(obj.name);

		// ✔ Method accessible
		obj.display();

	}
}
