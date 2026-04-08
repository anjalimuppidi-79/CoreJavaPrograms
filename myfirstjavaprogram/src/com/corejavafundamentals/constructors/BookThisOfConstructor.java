//05-03-2026
/*Write a Java program to demonstrate constructor chaining using the this() keyword.
Requirements:Create a class named BookThisOfConstructor.
Declare the following instance variables:bookName,authorName,price,released
Create multiple constructors with different parameters:
No-argument constructor,One-argument constructor,Two-argument constructor
Three-argument constructor,Four-argument constructor
Use constructor chaining with this() so that each constructor calls another constructor with more parameters.
Initialize the values of the instance variables in the four-argument constructor.
Create a display() method to print the book details.
In the main method, create an object using the no-argument constructor and display the book information.*/
package com.corejavafundamentals.constructors;

public class BookThisOfConstructor {
	String bookName;
	String authorName;
	double price;
	String released;

	BookThisOfConstructor() {
		System.out.println("no-arg Constructor");
		this("Love Diel");
	}

	BookThisOfConstructor(String bookName) {
		System.out.println("one-arg constructor Called");
		this(bookName, "William Belly");
	}

	BookThisOfConstructor(String bookName, String authorName) {
		System.out.println("two-arg Constructor Called");
		this(bookName, authorName, 500);
	}

	BookThisOfConstructor(String bookName, String authorName, double price) {
		System.out.println("three-arg Constructor Called");
		this(bookName, authorName, price, "18-09-1988");

	}

	BookThisOfConstructor(String bookName, String authorName, double price, String released) {
		System.out.println("Four-arg Constructor Called");
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.released = released;

	}

	public static void main(String[] args) {
		BookThisOfConstructor obj = new BookThisOfConstructor();
		obj.display();

	}

	void display() {
		System.out.println("BookName:" + bookName);
		System.out.println("Author Name:" + authorName);
		System.out.println("Price of the Book" + price);
		System.out.println("Released Date" + released);

	}

}
