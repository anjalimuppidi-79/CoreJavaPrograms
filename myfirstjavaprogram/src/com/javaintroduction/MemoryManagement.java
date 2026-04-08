package com.javaintroduction;

public class MemoryManagement {
	MemoryManagement obj = new MemoryManagement();

	public static void main(String[] args) {
		System.out.println("main method started");
		// object creation
		MemoryManagement obj = new MemoryManagement();

	}

	static {
		System.out.println("static block");
		MemoryManagement obj = new MemoryManagement();

	}

	// instance

	{

		System.out.println("instance block");
		MemoryManagement obj = new MemoryManagement();
	}
}
