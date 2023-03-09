package com.microservices.car.service;

import com.microservices.car.model.Car;

import java.util.List;

public interface BDInterface {

    List<Car> findAll();

    Car findById(int id);

    Car save(Car car);

    List<Car> findByUserId(int id);

}
