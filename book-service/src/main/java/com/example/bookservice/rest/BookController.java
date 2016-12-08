package com.example.bookservice.rest;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import com.example.bookservice.vo.BookVO;
import com.example.service.circuitbreaker.InventoryServiceClient;
import com.example.service.circuitbreaker.ReviewServiceClient;
import com.example.util.DozerBeanUtil;

@RestController
@RequestMapping({"/api/v1", ""})
public class BookController {

	@Autowired
	private InventoryServiceClient inventoryServiceClient;
	
	@Autowired
	private ReviewServiceClient reviewServiceClient;
	
	@Autowired
	private BookService bookService;
	

	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<BookVO> getBooks() {
		
		List<Book> books = bookService.findAllBooks();
		Mapper mapper = new DozerBeanMapper();
		List<BookVO> booksToReturn  = DozerBeanUtil.map(mapper, books, BookVO.class);
		
		for (BookVO book : booksToReturn) {
			book.setInventory(inventoryServiceClient.getInventory(book.getIsbn()));
			book.setReviews(reviewServiceClient.getReviews(book.getIsbn()));
		}

		return booksToReturn;
	}




}