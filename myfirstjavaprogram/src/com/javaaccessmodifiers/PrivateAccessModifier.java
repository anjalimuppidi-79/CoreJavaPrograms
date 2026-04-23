package com.javaaccessmodifiers;

class PrivateAccessModifier {
	// private class PrivateAccessModifier {
// Illegal modifier for top-level class PrivateAccessModifier
// Only public, abstract, and final are permitted
	private int id = 1;
	private String name = "Java";

	// Static block
	static {
		// We cannot use private (or any access modifier) 
		//for blocks
		System.out.println("static block");
	}

	// Instance block
	{
		// Instance blocks also cannot have access modifiers
		System.out.println("Instance block");
	}

	PrivateAccessModifier() {
		// Constructor called when object is created
		System.out.println("Constructor called");
	}

	private void accessModifier() {
		// Private method accessible only within the same class
		System.out.println("Method called");
	}

	public static void main(String[] args) {

		PrivateAccessModifier p1 = new PrivateAccessModifier();

		// We can access private data members within the same 
		//class
		System.out.println(p1.id);
		System.out.println(p1.name);
		p1.accessModifier();
	}

}