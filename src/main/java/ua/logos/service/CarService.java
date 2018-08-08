package ua.logos.service;

import ua.logos.domain.CarDTO;

import java.util.List;

public interface CarService {

    void create(CarDTO dto);

    void update(CarDTO dto);

    void delete(String carId);

    List<CarDTO> findAll();

    CarDTO findByCarId(String carId);
}
