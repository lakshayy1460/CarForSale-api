package com.example.CarForSale_api.service;

import java.util.List;
import java.util.Optional;

import com.example.CarForSale_api.entity.Order;
import com.example.CarForSale_api.input.OrderInput;

public interface OrderService {

    public List<Order> getAllOrders();

    public Optional<Order> getOrderById(String id);

    public Order addOrder(OrderInput orderInput);

    public List<Order> updateOrder(String id, OrderInput orderInput);

    public List<Order> deleteOrder(String id);

}
