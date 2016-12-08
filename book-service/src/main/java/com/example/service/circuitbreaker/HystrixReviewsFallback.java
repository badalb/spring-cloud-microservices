package com.example.service.circuitbreaker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.bookservice.vo.ReviewVO;

@Component
public class HystrixReviewsFallback implements ReviewServiceClient{
	
	public List<ReviewVO> getReviews(String isbn) {
		return new ArrayList<>();
	}
}
