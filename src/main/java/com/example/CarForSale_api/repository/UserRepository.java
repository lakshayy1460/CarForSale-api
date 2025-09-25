package com.example.CarForSale_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.CarForSale_api.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
