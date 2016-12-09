package com.example.reviewservice.service;

import java.util.List;

import com.example.reviewservice.model.Review;

public interface ReviewService {

	public List<Review> findAllReviews(String isbn);
}
