package com.echannel.propertymanagement.controllers;

import com.echannel.propertymanagement.dtos.PropertyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertiesController {

    @PostMapping("")
    public ResponseEntity<PropertyDto> saveProperty(@RequestBody PropertyDto propertyDto){

        // propertyDTO = propertyService.saveProperty(propertyDto);

        ResponseEntity<PropertyDto> responseEntity = new ResponseEntity<>(propertyDto, HttpStatus.CREATED);
        return responseEntity;
    }

}
