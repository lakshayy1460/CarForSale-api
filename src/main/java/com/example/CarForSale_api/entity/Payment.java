package com.example.CarForSale_api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.CarForSale_api.enums.PaymentMethod;
import com.example.CarForSale_api.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("payments")
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    String id;

    String orderId;

    int amount;

    PaymentMethod method;

    PaymentStatus status;

    String transactionId;

}
