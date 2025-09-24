package com.example.CarForSale_api.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("reviews")
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    String id;

    String carId;

    String buyerId;

    double rating;

    String comment;

    Date createdAt;

}
