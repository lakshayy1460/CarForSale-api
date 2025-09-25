package com.example.CarForSale_api.service;

import java.util.List;
import java.util.Optional;

import com.example.CarForSale_api.entity.Car;
import com.example.CarForSale_api.input.CarInput;

public interface CarService {

    public List<Car> getAllCars(int page, int limit, String sortBy, int sortDirection);

    public Optional<Car> getCarById(String id);

    public Car addCar(CarInput carInput);

    public Car updateCar(String id, CarInput carInput);

    public boolean deleteCar(String id);

}
