package com.microservices.car.service;

import com.microservices.car.model.Car;
import com.microservices.car.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ServiceBD implements BDInterface{

    CarRepository bd;

    @Override
    public List<Car> findAll() {
        return bd.findAll();
    }

    @Override
    public Car findById(int id) {
        return bd.findById(id).orElse(null);
    }

    @Override
    public Car save(Car car) {
       return bd.save(car);
    }

    @Override
    public List<Car> findByUserId(int id) {
        return bd.findByUserId(id);
    }
}
