package com.microservices.car.controller.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class CarDTO {

    @NotNull
    private String marca;

    @NotNull
    private String model;

    @NotNull
    private int userId;
}
