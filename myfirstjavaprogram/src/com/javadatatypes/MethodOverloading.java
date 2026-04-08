package com.javadatatypes;

public class MethodOverloading {
	public static void display(double a) {
		System.out.println("int");
	}

	public static void display(byte a) {
		System.out.println("byte");
	}

	public static void main(String[] args) {
		display(128);

	}

}
