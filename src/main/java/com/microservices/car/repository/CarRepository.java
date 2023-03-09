package com.microservices.car.repository;

import com.microservices.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query("SELECT a FROM Car a WHERE a.userId = :userId")
    List<Car> findByUserId(@Param("userId") int userId);
}
