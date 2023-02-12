package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImpl;
import entities.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao dao;

	public BookServiceImpl() {
		super();
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookId(int id) {
		
		return dao.getBookId(id);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public Long getBooksCount() {
		// TODO Auto-generated method stub
		return dao.getBooksCount();
	}

	@Override
	public List<Book> getBookByPrice(int low, int high) {
		// TODO Auto-generated method stub
		return dao.getBookByPrice(low, high);
	}

}