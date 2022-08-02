package com.echannel.propertymanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    //http://localhost:8080/api/v1/Greetings/greet
    @GetMapping("/greet")
    public String sayHello(){
        return "Hello Spring Boot!";
    }

}
