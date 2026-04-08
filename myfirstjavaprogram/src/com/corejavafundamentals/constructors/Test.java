//Inheritance Example

package com.corejavafundamentals.constructors;
class A{
	String name;
	void m1(){
		System.out.println("method1");

	}
}
class B extends A{
	int age;
	void m2() {
		System.out.println("method2");
	}
	
}

public class Test {

	public static void main(String[] args) {
		 A a1=new A();
		 B b1=new B();
		
		

	}

}
