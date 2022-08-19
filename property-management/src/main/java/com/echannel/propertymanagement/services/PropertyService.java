package com.echannel.propertymanagement.services;

import com.echannel.propertymanagement.dtos.PropertyDto;

import java.util.List;

public interface PropertyService {

    PropertyDto saveProperty(PropertyDto propertyDto);

    List<PropertyDto> getAllProperties();

    PropertyDto updateProperty(PropertyDto propertyDTO, Long propertyId);
}
