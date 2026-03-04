package com.javalabtasksmethods;

public class Test12 {

	static void method1() {
		System.out.println("java is simple");

	}

	static void method2() {
		System.out.println("java is high=level");

	}

	void method3() {
		System.out.println("java is plat-independent");
	}

	String method4() {
		String course = "JSF";
		return course;
	}

	public static void main(String[] args) {
		Test12 t1 = new Test12();
		method1();
		method2();
		t1.method3();
		System.out.println("course:" + t1.method4());

	}
}
