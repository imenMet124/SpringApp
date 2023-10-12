package com.imen.garageApp.service;

import com.imen.garageApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    static private ArrayList<Car> cars =new ArrayList<>(Arrays.asList(
           new Car(1,"laguna","renault",2004,Car.Color.BLUE),
           new Car(2,"5008","Peugeot",2013,Car.Color.YELLOW),
           new Car(3,"C4","Citroen",2006,Car.Color.BLUE),
           new Car(4,"206","Peugeot",2004,Car.Color.GREEN),
           new Car(5,"laguna","renault",2010,Car.Color.RED)
    ));

    public List<Car> getCars(){
        return cars;
    }

    public Car getCar(long id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    public void deleteCar(long id) {
        cars.removeIf(car -> car.getId()== id);
    }

    public void addCar(Car car) {
        cars.add(car);

    }

    public void updateCar(Car car, long id) {
        cars.forEach(car1 -> {
            if (car1.getId()== id){
                cars.set(cars.indexOf(car1),car);
            }
        });

    }
}
