package com.example.CarForSale_api.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.CarForSale_api.entity.Car;
import com.example.CarForSale_api.enums.CarStatus;
import com.example.CarForSale_api.input.CarInput;
import com.example.CarForSale_api.repository.CarRepository;
import com.example.CarForSale_api.service.CarService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<Car> getAllCars(int page, int limit, String sortBy, int sortDirection) {
        Sort sort = Sort.unsorted();

        if (!sortBy.equals(null)) {
            Sort.Direction direction = sortDirection == 1 ? Sort.Direction.ASC
                    : sortDirection == -1 ? Sort.Direction.DESC : null;
            sort = direction == null ? Sort.unsorted() : Sort.by(direction, sortBy);
        }

        Pageable pageable = PageRequest.of(page - 1, limit, sort);
        return carRepository.findAll(pageable).getContent();

    }

    public Optional<Car> getCarById(String id) {
        Optional<Car> carFromDB = carRepository.findById(id);
        return carFromDB;
    }

    public Car addCar(CarInput carInput) {
        log.info("Control inside CarServiceImpl.addCar()");
        Car car = modelMapper.map(carInput, Car.class);

        // car.print();
        // car.setId(null);
        car.setStatus(CarStatus.AVAILABLE);
        car.setCreatedAt(new Date());
        car.setUpdatedAt(new Date());
        car.setDeleted(false);

        Car newCar = carRepository.save(car);
        // newCar.print();

        return newCar;
    }

    public Car updateCar(String id, CarInput carInput) {

        Optional<Car> carFromDB = carRepository.findById(id);

        if (carFromDB.isPresent()) {

            Car car = carFromDB.get();

            if (carInput.getMake() != null) {
                car.setMake(carInput.getMake());
            }
            if (carInput.getModel() != null) {
                car.setModel(carInput.getModel());
            }
            if (carInput.getYear() != 0) {
                car.setYear(carInput.getYear());
            }
            if (carInput.getMileage() != 0) {
                car.setMileage(carInput.getMileage());
            }
            if (carInput.getPrice() != 0) {
                car.setPrice(carInput.getPrice());
            }
            if (carInput.getDescription() != null) {
                car.setDescription(carInput.getDescription());
            }
            if (carInput.getImages() != null) {
                car.setImages(carInput.getImages());
            }

            car.setUpdatedAt(new Date());

            Car updatedCar = carRepository.save(car);
            return updatedCar;
        }
        return null;
    }

    public boolean deleteCar(String id) {

        Car carFromDB = carRepository.findById(id).orElse(null);
        if (carFromDB != null) {
            carFromDB.setDeleted(true);
            carRepository.save(carFromDB);
            return true;
        }
        return false;
    }

}