package com.example.CarForSale_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.CarForSale_api.entity.Payment;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {

}
