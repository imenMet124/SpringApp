package com.imen.garageApp.controller;

import com.imen.garageApp.model.Car;
import com.imen.garageApp.service.GarageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class GarageController {


    private GarageService garageService;
    @RequestMapping("/cars")

    public List<Car> getCar(){
        return garageService.getCars();
    }

}
