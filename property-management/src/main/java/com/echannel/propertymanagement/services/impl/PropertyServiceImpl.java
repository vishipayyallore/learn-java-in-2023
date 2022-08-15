package com.echannel.propertymanagement.services.impl;

import com.echannel.propertymanagement.dtos.PropertyDto;
import com.echannel.propertymanagement.services.PropertyService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Override
    public PropertyDto saveProperty(PropertyDto propertyDto) {

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

}
