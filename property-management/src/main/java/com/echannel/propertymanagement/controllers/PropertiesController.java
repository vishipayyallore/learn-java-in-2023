package com.echannel.propertymanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertiesController {

    //http://localhost:8080/api/v1/properties/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Spring Boot!";
    }

}
