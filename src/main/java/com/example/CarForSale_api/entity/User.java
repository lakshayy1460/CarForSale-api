package com.example.CarForSale_api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    String id;

    String name;

    String email;

    String password;

    // UserRole role;

}
