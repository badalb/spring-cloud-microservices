package com.example.reviewservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.reviewservice.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

	public List<Review> findByIsbn(String isbn);
}
