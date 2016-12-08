package com.example.reviewservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reviewservice.model.Review;
import com.example.reviewservice.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	@Override
	public List<Review> findAllReviews(String isbn) {
		return reviewRepository.findByIsbn(isbn);
	}

}
