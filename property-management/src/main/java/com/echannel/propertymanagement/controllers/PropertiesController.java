package com.echannel.propertymanagement.controllers;

import com.echannel.propertymanagement.dtos.PropertyDto;
import com.echannel.propertymanagement.services.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertiesController {

    private final PropertyService propertyService;

    public PropertiesController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping("")
    public ResponseEntity<PropertyDto> saveProperty(@RequestBody PropertyDto propertyDto) {

        propertyDto = propertyService.saveProperty(propertyDto);

        return new ResponseEntity<>(propertyDto, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<PropertyDto>> getAllProperties() {
        List<PropertyDto> propertyList = propertyService.getAllProperties();

        return new ResponseEntity<>(propertyList, HttpStatus.OK);
    }

    @PutMapping("/{propertyId}")
    public ResponseEntity<PropertyDto> updateProperty(@RequestBody PropertyDto propertyDTO, @PathVariable Long propertyId) {
        propertyDTO = propertyService.updateProperty(propertyDTO, propertyId);

        return new ResponseEntity<>(propertyDTO, HttpStatus.OK);
    }

}
