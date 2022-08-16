package com.echannel.propertymanagement.converters;

import com.echannel.propertymanagement.dtos.PropertyDto;
import com.echannel.propertymanagement.entities.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity convertDTOtoEntity(PropertyDto propertyDTO){

        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());

        return pe;
    }

    public PropertyDto convertEntityToDTO(PropertyEntity propertyEntity){

        PropertyDto propertyDTO =  new PropertyDto();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setDescription(propertyEntity.getDescription());
        // propertyDTO.setUserId(propertyEntity.getUserEntity().getId());

        return propertyDTO;
    }
}
