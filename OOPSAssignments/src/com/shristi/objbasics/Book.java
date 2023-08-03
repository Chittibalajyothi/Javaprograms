package com.shristi.objbasics;

public class Book {
	String title;
	String author;
	double price;
	
public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void printDetails() {
		System.out.println("Book Title is "+title);
		System.out.println("Book Author is "+author);
		System.out.println("Book price is "+price);
	}
	
	void checkBookType() {
		if(price>500) {
			System.out.println("Premium books");
		}
		else {
			System.out.println("standard book");
		}
	}
}
