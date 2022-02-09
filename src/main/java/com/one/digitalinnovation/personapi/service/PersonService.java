package com.one.digitalinnovation.personapi.service;

import com.one.digitalinnovation.personapi.dto.mappers.PersonMapper;
import com.one.digitalinnovation.personapi.dto.request.PersonDTO;
import com.one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import com.one.digitalinnovation.personapi.entity.Person;
import com.one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.one.digitalinnovation.personapi.dto.response.MessageResponseDTO.*;


@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
    //    return MessageResponseDTO.builder().build();
        return MessageResponseDTO.builder().message("Created Person with ID " + savedPerson.getId()).build();
    }
}
