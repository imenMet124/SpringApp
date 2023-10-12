package com.imen.garageApp.service;

import com.imen.garageApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    static private ArrayList<Car> cars =new ArrayList<>(Arrays.asList(
           new Car("laguna","renault",2004,Car.Color.BLUE),
           new Car("5008","Peugeot",2013,Car.Color.YELLOW),
           new Car("C4","Citroen",2006,Car.Color.BLUE),
           new Car("206","Peugeot",2004,Car.Color.GREEN),
           new Car("laguna","renault",2010,Car.Color.RED)
    ));

    public List<Car> getCars(){
        return cars;
    }
}
