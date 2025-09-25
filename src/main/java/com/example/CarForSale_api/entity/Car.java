package com.example.CarForSale_api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.CarForSale_api.enums.CarStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    String id;

    String make;

    String model;

    int year;

    int mileage;

    int price;

    String description;

    CarStatus status;

    String sellerId;

    List<String> images;

    Date createdAt;

    Date updatedAt;

    boolean isDeleted;

}
