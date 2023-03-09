package com.microservices.car.service;

import com.microservices.car.controller.dto.CarDTO;
import com.microservices.car.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    ServiceBD bd;

    public List<Car> getAll(){
        return bd.findAll();
    }

    public Car getCarroById(int id) {
        return bd.findById(id);
    }

    public Car newCar(CarDTO car) {
        Car newCar = Car.builder()
                .marca(car.getMarca())
                .userId(car.getUserId())
                .model(car.getModel())
                .build();

        return bd.save(newCar);
    }

    public List<Car> byUserId(int userId){
        return bd.findByUserId(userId);
    }
}
