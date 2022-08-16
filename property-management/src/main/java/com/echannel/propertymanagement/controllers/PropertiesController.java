package com.echannel.propertymanagement.controllers;

import com.echannel.propertymanagement.dtos.PropertyDto;
import com.echannel.propertymanagement.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertiesController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping("")
    public ResponseEntity<PropertyDto> saveProperty(@RequestBody PropertyDto propertyDto){

        propertyDto = propertyService.saveProperty(propertyDto);

        ResponseEntity<PropertyDto> responseEntity = new ResponseEntity<>(propertyDto, HttpStatus.CREATED);
        return responseEntity;
    }

}