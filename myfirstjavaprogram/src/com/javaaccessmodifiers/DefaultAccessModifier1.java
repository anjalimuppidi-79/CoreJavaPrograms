package com.javaaccessmodifiers;

public class DefaultAccessModifier1 {

	public static void main(String[] args) {

		// ✔ Constructor accessible within the same package
	DefaultAccessModifiers obj = new DefaultAccessModifiers();

		// ✔ Data members accessible within the same package
		System.out.println(obj.id);
		System.out.println(obj.name);

		// ✔ Method accessible within the same package
		obj.display();
	}
}
