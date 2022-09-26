package com.echannel.propertymanagement.services.impl;

import com.echannel.propertymanagement.converters.PropertyConverter;
import com.echannel.propertymanagement.dtos.PropertyDto;
import com.echannel.propertymanagement.entities.PropertyEntity;
import com.echannel.propertymanagement.repositories.PropertyRepository;
import com.echannel.propertymanagement.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyConverter propertyConverter;

    @Override
    public PropertyDto saveProperty(PropertyDto propertyDto) {

        PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDto);

        pe = propertyRepository.save(pe);
        propertyDto.setId(pe.getId());

        /*
        Optional<UserEntity> optUe = userRepository.findById(propertyDTO.getUserId());
        if(optUe.isPresent()) {
            PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDTO);
            pe.setUserEntity(optUe.get());
            pe = propertyRepository.save(pe);

            propertyDTO = propertyConverter.convertEntityToDTO(pe);
        }else{
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("USER_ID_NOT_EXIST");
            errorModel.setMessage("User does not exist");
            errorModelList.add(errorModel);

            throw new BusinessException(errorModelList);
        }
        */

        return propertyDto;
    }

    @Override
    public List<PropertyDto> getAllProperties() {
        List<PropertyEntity> listOfProps = (List<PropertyEntity>) propertyRepository.findAll();
        List<PropertyDto> propList = new ArrayList<>();

        for (PropertyEntity pe : listOfProps) {
            PropertyDto dto = propertyConverter.convertEntityToDTO(pe);
            propList.add(dto);
        }

        return propList;
    }

    @Override
    public PropertyDto updateProperty(PropertyDto propertyDTO, Long propertyId) {

        Optional<PropertyEntity> optEn =  propertyRepository.findById(propertyId);
        PropertyDto dto = null;

        if(optEn.isPresent()){

            PropertyEntity pe = optEn.get();    //data from database
            pe.setTitle(propertyDTO.getTitle());
            pe.setAddress(propertyDTO.getAddress());
            pe.setPrice(propertyDTO.getPrice());
            pe.setDescription(propertyDTO.getDescription());

            dto = propertyConverter.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }

        return dto;
    }

    @Override
    public PropertyDto updatePropertyDescription(PropertyDto propertyDTO, Long propertyId) {
        return null;
    }

    @Override
    public PropertyDto updatePropertyPrice(PropertyDto propertyDTO, Long propertyId) {
        return null;
    }

}
