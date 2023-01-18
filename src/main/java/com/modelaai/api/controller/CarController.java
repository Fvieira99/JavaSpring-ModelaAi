package com.modelaai.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.dto.CarDTO;
import com.modelaai.api.model.Car;
import com.modelaai.api.repository.CarRepository;

@RequestMapping("/car")
@RestController
public class CarController {
    
    @Autowired
    private CarRepository carRepository;


    @PostMapping("/create")
    public void createCar(@RequestBody CarDTO req){
        carRepository.save(new Car(req));
    }

    @GetMapping("/listall")
    public List<Car> listAll(){
        return carRepository.findAll();
    }

}
