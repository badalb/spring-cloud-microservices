package com.example.bookservice.service;

import java.util.List;

import com.example.bookservice.model.Book;

public interface BookService {

	public List<Book> findAllBooks();
	
	public Book findBook(Long id);
}
