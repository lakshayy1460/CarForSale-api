package com.example.CarForSale_api.enums;

public enum OrderStatus {

    PENDING("pending"),
    CONFIRMED("confirmed"),
    CANCELLED("cancelled"),
    COMPLETED("completed");

    public final String status;

    OrderStatus(String status) {
        this.status = status;
    }

}
