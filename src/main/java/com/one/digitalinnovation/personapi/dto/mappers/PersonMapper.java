package com.one.digitalinnovation.personapi.dto.mappers;

import com.one.digitalinnovation.personapi.dto.request.PersonDTO;
import com.one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthData", source = "birthData", dateFormat = "dd-MM-yyyy")
    default Person toModel(PersonDTO personDTO) {
        return null;
    }
  //  Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

}
