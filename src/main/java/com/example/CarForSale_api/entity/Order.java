package com.example.CarForSale_api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.CarForSale_api.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    String id;

    String carId;

    String buyerId;

    Date orderDate;

    OrderStatus status;

}