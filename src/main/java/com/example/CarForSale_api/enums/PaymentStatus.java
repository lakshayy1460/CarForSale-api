package com.example.CarForSale_api.enums;

public enum PaymentStatus {

    PENDING("pending"),
    SUCCESS("success"),
    FAILED("failed");

    public final String status;

    PaymentStatus(String status) {
        this.status = status;
    }

}
