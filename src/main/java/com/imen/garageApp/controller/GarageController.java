package com.imen.garageApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GarageController {
    @RequestMapping("/hello")

    public String sayHello (){
        return "hello world";
    }

}
