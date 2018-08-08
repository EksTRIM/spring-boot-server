package ua.logos.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor

public class CarDTO {

    private Long id;

    private String carId;

    private String make;

    private String model;

    private String color;

    private String image;

    private BigDecimal engine;

    private BigDecimal price;

    private LocalDate modelYear;

    private String transmission;

    private String typeOfDrive;

    private String fuelType;
}
