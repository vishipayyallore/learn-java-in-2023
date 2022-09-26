package com.echannel.propertymanagement.services;

import com.echannel.propertymanagement.dtos.PropertyDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PropertyService {

    PropertyDto saveProperty(PropertyDto propertyDto);

    List<PropertyDto> getAllProperties();

    PropertyDto updateProperty(PropertyDto propertyDTO, Long propertyId);

    PropertyDto updatePropertyDescription(@RequestBody PropertyDto propertyDTO, Long propertyId);

    PropertyDto updatePropertyPrice(@RequestBody PropertyDto propertyDTO, Long propertyId);

}
