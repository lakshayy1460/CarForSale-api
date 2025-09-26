package com.example.CarForSale_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarForSale_api.entity.ApiResponse;
import com.example.CarForSale_api.entity.Car;
import com.example.CarForSale_api.input.CarInput;
import com.example.CarForSale_api.service.CarService;
import com.example.CarForSale_api.utils.ErrorMessageConstants;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/cars")
@Slf4j
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<Car>>> getAllCars(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "5") int limit,
            @RequestParam(defaultValue = "", required = false) String sortBy,
            @RequestParam(defaultValue = "1") int sortDirection) {

        if (limit < 0) {
            return ApiResponse.buildError(ErrorMessageConstants.INVALID_LIMIT, HttpStatus.BAD_GATEWAY);
        }

        if (sortDirection != 1 && sortDirection != -1) {
            return ApiResponse.buildError(ErrorMessageConstants.INVALID_DIRECTION, HttpStatus.BAD_GATEWAY);
        }

        List<String> validSortFields = List.of("");
        if (sortBy != null && !sortBy.isEmpty() && !validSortFields.contains(sortBy)) {
            return ApiResponse.buildError(ErrorMessageConstants.INVALID_SORT_FIELD, HttpStatus.BAD_GATEWAY);
        }

        return ApiResponse.buildResponse(carService.getAllCars(page, limit, sortBy, sortDirection), "Fetched All Cars",
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable String id) {
        return carService.getCarById(id);
    }

    @PostMapping("")
    public Car addCar(@RequestBody CarInput carInput) {
        log.info("Control inside CarController.addCar()");
        return carService.addCar(carInput);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable String id, @RequestBody CarInput carInput) {
        return carService.updateCar(id, carInput);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCar(String id) {
        return carService.deleteCar(id);
    }

}
