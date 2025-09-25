package com.example.CarForSale_api.service;

import java.util.List;
import java.util.Optional;

import com.example.CarForSale_api.entity.Review;
import com.example.CarForSale_api.input.ReviewInput;

public interface ReviewService {

    public List<Review> getAllReviews();

    public Optional<Review> getReviewById(String id);

    public Review addReview(ReviewInput reviewInput);

    public List<Review> updateReview(String id, ReviewInput reviewInput);

    public List<Review> deleteReview(String id);

}
