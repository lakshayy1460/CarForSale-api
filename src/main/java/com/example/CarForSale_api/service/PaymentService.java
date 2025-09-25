package com.example.CarForSale_api.service;

import java.util.List;
import java.util.Optional;

import com.example.CarForSale_api.entity.Payment;
import com.example.CarForSale_api.input.PaymentInput;

public interface PaymentService {

    public List<Payment> getAllPayments();

    public Optional<Payment> getPaymentById(String id);

    public Payment addPayment(PaymentInput paymentInput);

    public List<Payment> updatePayment(String id, PaymentInput paymentInput);

    public List<Payment> deletePayment(String id);

}
