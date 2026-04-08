/*
We have a 3-level inheritance chain: GrandParent → Parent → Child.
Each class has a display() method.
In Child.display(), you must call:
1) Its own method body.
2) The parent’s display() method.
3) The grandparent’s display() method

package com.corejavafundamentals.constructors;

class Animal {
	String name;

	void displayAnimal() {
		name = "Dog";
		System.out.println("Name of the animal:" + name);

	}

}

class Dog extends Animal {
	int age;
	String breed;

	void displayDog() {
		super.displayAnimal();
		age = 5;
		breed = "Pomeranian";
		System.out.println("Age of the animal:" + age);
		System.out.println("Breed of the Animal:" + breed);
	}

}

public class Puppy extends Dog {

	String colour;

	void displayPuppy() {
		super.displayDog();
		colour = "White";
		System.out.println("colour of the Animal:" + colour);

	}

	public static void main(String[] args) {
		Puppy p1 = new Puppy();
		p1.displayPuppy();

	}
}
*/

package com.corejavafundamentals.constructors;

class Animal {
	String name;
	int age;
	String breed;

	void displayAnimal() {
		name = "Luna";
		age = 2;
		breed = "Golden Retriever";
		System.out.println("Dog name:" + name);

	}

}

class Dog extends Animal {
	int age;

	void displayDog() {
		super.displayAnimal();
		this.age=super.age;
		System.out.println("Dog age:" + age);

	}
}

public class Puppy extends Dog {
	String breed;

	void displayPuppy() {
		
		super.displayDog();
		this.breed = super.breed;
		System.out.println("Dog breed:" + breed);

	}

	public static void main(String[] args) {
		Puppy p1 = new Puppy();
		p1.displayPuppy();

	}
}
