package com.javaintroduction;

public class InstanceMethods {
	


	static void method() {
		System.out.println("static method1");
		run();

	}

	static void run() {
		System.out.println("static method2");
	}

	void show() {
		System.out.println("method1");
		method();

	}

	void cook() {
		System.out.println("method2");
		show();
	}

	static  {
		InstanceMethods f = new InstanceMethods();
		f.cook();
	}
	
	public static void main(String[] args) {
		System.out.println("main method is executed");
	
	}

}
