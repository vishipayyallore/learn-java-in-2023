package com.echannel.propertymanagement.controllers;

import com.echannel.propertymanagement.dtos.CalculatorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/calculator") //class level mapping of url to a controller class
public class CalculatorController {

    // http://localhost:8080/api/v1/calculator/add/3?num1=6.7&num2=1.2
    @GetMapping("/add/{num3}") //method level mapping of a url to a controller function
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2,
                      @PathVariable("num3") Double num3) {
        return num1 + num2;
    }

    // http://localhost:8080/api/v1/calculator/sub/4.5/4.5
    @GetMapping("/sub/{num1}/{num2}")//Map the values of url to java variables by Path variable method
    public Double substract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        Double result = 0.0;

        if (num1 > num2) {
            result = num1 - num2;
        } else if (num2 > num1) {
            result = num2 - num1;
        }

        return result;
    }

    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDto calculatorDto) {
        Double result = null;

        result = calculatorDto.getNum1() * calculatorDto.getNum2() * calculatorDto.getNum3() * calculatorDto.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);

        return responseEntity;
    }

}
