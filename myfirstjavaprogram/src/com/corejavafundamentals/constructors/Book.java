//04-03-2026
/*️3) No-Args Constructor Initialization
Problem:Create a class Book with variables:
title,author,price

Create a no-argument constructor that assigns:

title = "Java Programming"
author = "James Gosling"
price = 500

Create a method display() to print book details.*/

package com.corejavafundamentals.constructors;

public class Book {
	String title;
	String author;
	double price;

	// No-Args Constructor
	Book() {
		title = "Java Programming";
		author = "James Gosling";
		price = 500;

	}

	// Method to display book details
	void display() {
		System.out.println("Title of the book:" + title);
		System.out.println("Author of the Book" + author);
		System.out.println("Price of the book:" + price);

	}

	public static void main(String[] args) {
		Book obj = new Book();
		obj.display();

	}

}
