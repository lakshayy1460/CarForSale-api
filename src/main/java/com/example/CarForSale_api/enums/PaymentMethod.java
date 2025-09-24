package com.example.CarForSale_api.enums;

public enum PaymentMethod {

    CREDIT_CARD("credit_card"),
    UPI("upi"),
    PAYPAL("paypal");

    public final String method;

    PaymentMethod(String method) {
        this.method = method;
    }

}
