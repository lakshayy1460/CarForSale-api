package com.example.CarForSale_api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.CarForSale_api.enums.CarStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Document("cars")
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Car {

    @Id
    private String id;

    private String sellerId;

    private String make;

    private String model;

    private int year;

    private int mileage;

    private int price;

    private String description;

    private CarStatus status;

    private List<String> images;

    private Date createdAt;

    private Date updatedAt;

    private boolean isDeleted;

    public void print() {
        log.info(String.format("id: %s,sellerId: %s, make: %s ", this.id, this.sellerId, this.make));
    }

}
