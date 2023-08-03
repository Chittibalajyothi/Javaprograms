package com.lumen.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.lumen.model.Book;

public class BookDetails {
	static ArrayList<Book> bookList = new ArrayList<Book>();
	static List<Book> arrayList = Arrays.asList(
			new Book("Java in Action", "David", "Tech", 1, 700.90),
			new Book("C language", "kathy", "Selfhelp", 2, 200.68),
			new Book("Maven", "Ben John", "klin", 3, 900.45),
			new Book("Servlets", "Evin Ben", "john", 4, 800.06),
			new Book("Java not in Action", "amar", "nothing", 5, 600.56)
			);
	
	public static void addBooks(Book book) {
		bookList.add(book);
	}
	public static List<Book> showBooks() {		
		for(Book book : arrayList) {
			addBooks(book);
		}
		return bookList;	
	}
}
