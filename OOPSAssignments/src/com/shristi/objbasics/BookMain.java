package com.shristi.objbasics;
public class BookMain {

	public static void main(String[] args) {

		Book book = new Book("Core java", "john", 900.9);
		book.printDetails();
		book.checkBookType();
		
		Book book1 = new Book("Java Basics", "kathy", 400.7);
		book1.printDetails();
		book1.checkBookType();
	
	}

}
