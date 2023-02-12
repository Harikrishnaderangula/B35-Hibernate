package service;

import java.util.List;

import entities.Book;

public interface BookService {
	
	
	//abstract method
	Book getBookId(int id);
	List<Book>getAllBooks();
	List<Book>getAuthorBooks(String author);
	Long getBooksCount();
	List<Book>getBookByPrice(int low,int high);
}
