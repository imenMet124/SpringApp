package com.imen.garageApp.controller;

import com.imen.garageApp.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GarageController {
    @RequestMapping("/car")

    public Car getCard(){
        Car myCar= new Car("laguna","renault",2004,Car.Color.RED);
        return myCar;
    }

}
