package com.microservices.car.repository;

import com.microservices.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findByUserId(int userId);
}
