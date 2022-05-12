package com.xiaodi.qa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World";
    }
}
