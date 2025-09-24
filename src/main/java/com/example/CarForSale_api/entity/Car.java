package com.example.CarForSale_api.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

    // status ;

    String sellerId;

    List<String> images;

}
