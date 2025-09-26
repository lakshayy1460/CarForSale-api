package com.example.CarForSale_api.input;

import java.util.Date;
import java.util.List;

import com.example.CarForSale_api.enums.CarStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarInput {

    private String sellerId;

    private String make;

    private String model;

    private int year;

    private int mileage;

    private int price;

    private String description;

    private CarStatus status;

    private List<String> images;

}
