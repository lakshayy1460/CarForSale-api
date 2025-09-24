package com.example.CarForSale_api.enums;

public enum UserRoleType {

    ADMIN("admin"),
    SELLER("seller"),
    BUYER("buyer");

    public final String status;

    UserRoleType(String status) {
        this.status = status;
    }

}
