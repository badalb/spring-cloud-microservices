package com.example.bookservice.vo;

import java.util.List;

public class BookVO {
	
	private String title;

	private String author;

	private String isbn;
	
	private Integer Inventory;
	
	private List<ReviewVO> reviews;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getInventory() {
		return Inventory;
	}

	public void setInventory(Integer inventory) {
		Inventory = inventory;
	}

	public List<ReviewVO> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewVO> reviews) {
		this.reviews = reviews;
	}

	
}
