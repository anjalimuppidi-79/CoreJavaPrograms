package com.corejavafundamentals;

public class Books {
	int bookId;
	String title;
	String author;
	int price;
	double discountPer;
	double finalPrice;

	public static void main(String[] args) {
		Books b = new Books();
		b.bookId = 1;
		b.title = "Atomic Habits";
		b.author = "James Clear";
		b.price = 200;
		b.discountPer = 200 * 0.1;
		b.finalPrice = 200 - b.discountPer;
		System.out.println("******Book1******");
		System.out.println("Book Id:" + b.bookId);
		System.out.println("Book Title:" + b.title);
		System.out.println("Book Author:" + b.author);
		System.out.println("Book Price:" + b.price);
		System.out.println("Book Discount Percentage:" + b.discountPer);
		System.out.println("Final Price:" + b.finalPrice);
		Books b1 = new Books();
		b1.bookId = 2;
		b1.title = "The 7 Habits of Highly Effective People ";
		b1.author = "Stephen R. Covey";
		b1.price = 500;
		b1.discountPer = 500 * 0.2;
		b1.finalPrice = 500 - b1.discountPer;
		System.out.println("******Book2******");
		System.out.println("Book Id:" + b1.bookId);
		System.out.println("Book Title:" + b1.title);
		System.out.println("Book Author:" + b1.author);
		System.out.println("Book Price:" + b1.price);
		System.out.println("Book Discount Percentage:" + b1.discountPer);
		System.out.println("Final Price:" + b1.finalPrice);
		Books b3 = new Books();
		b3.bookId = 1;
		b3.title = "Awaken the Giant Within ";
		b3.author = "Tony Robbins ";
		b3.price = 1200;
		b3.discountPer = 1200 * 0.5;
		b3.finalPrice = 1200 - b3.discountPer;
		System.out.println("******Book3******");
		System.out.println("Book Id:" + b3.bookId);
		System.out.println("Book Title:" + b3.title);
		System.out.println("Book Author:" + b3.author);
		System.out.println("Book Price:" + b3.price);
		System.out.println("Book Discount Percentage:" + b3.discountPer);
		System.out.println("Final Price:" + b3.finalPrice);

	}

}
