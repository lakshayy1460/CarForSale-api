package com.example.CarForSale_api.input;

import java.util.List;

import lombok.Data;

@Data
public class CarInput {

    String make;

    String model;

    int year;

    int mileage;

    int price;

    String description;

    // status

    String sellerId;

    List<String> images;
}
