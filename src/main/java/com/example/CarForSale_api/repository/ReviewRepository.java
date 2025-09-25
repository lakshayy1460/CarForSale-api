package com.example.CarForSale_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.CarForSale_api.entity.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

}
