package com.example.CarForSale_api.enums;

public enum CarStatus {

    AVAILABLE("available"),
    SOLD("sold"),
    RESERVED("reserved");

    public final String status;

    CarStatus(String status) {
        this.status = status;
    }

}
