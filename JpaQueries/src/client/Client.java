package client;

import service.BookService;
import service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();

		System.out.println("Total no.of books: "+service.getBooksCount());

		System.out.println("The Book with ID:"+" "+service.getBookId(12));

		System.out.println("The book wiht specific author:"+service.getAuthorBooks("sidhdhu"));

		System.out.println("The price between 2000 to 2500: "+service.getBookByPrice(2300, 2500));
		
		System.out.println("All books: "+service.getAllBooks());
	}

}
