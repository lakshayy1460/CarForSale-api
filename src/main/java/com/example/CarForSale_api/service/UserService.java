package com.example.CarForSale_api.service;

import java.util.List;
import java.util.Optional;

import com.example.CarForSale_api.entity.User;
import com.example.CarForSale_api.input.UserInput;

public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(String id);

    public User addUser(UserInput userInput);

    public List<User> updateUser(String id, UserInput userInput);

    public List<User> deleteUser(String id);

}
