package com.example.reviewservice.restapi;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviewservice.model.Review;
import com.example.reviewservice.service.ReviewService;
import com.example.reviewservice.util.DozerBeanUtil;
import com.example.reviewservice.vo.ReviewVO;

@RestController
@RequestMapping({ "/api/v1", "" })
public class ReviewController {

	@Autowired
	private ReviewService reviewService;

	@RequestMapping(value = "/books/{isbn}/reviews")
	public List<ReviewVO> getAllReviews(@PathVariable("isbn") String isbn) {
		List<Review> reviews = reviewService.findAllReviews(isbn);
		Mapper mapper = new DozerBeanMapper();
		List<ReviewVO> reviewsToReturn = DozerBeanUtil.map(mapper, reviews, ReviewVO.class);

		return reviewsToReturn;

	}

}
