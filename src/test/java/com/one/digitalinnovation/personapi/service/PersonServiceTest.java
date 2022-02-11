package com.one.digitalinnovation.personapi.service;

import com.one.digitalinnovation.personapi.dto.request.PersonDTO;
import com.one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import com.one.digitalinnovation.personapi.entity.Person;
import com.one.digitalinnovation.personapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.one.digitalinnovation.personapi.utils.PersonUtils.createFakeDTO;
import static com.one.digitalinnovation.personapi.utils.PersonUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage(){
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        Mockito.when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSucessMessage = createdExpectResponse(expectedSavedPerson.getId());

        MessageResponseDTO sucessMessage =  personService.createPerson(personDTO);

        assertEquals(expectedSucessMessage, sucessMessage);

    }

    private MessageResponseDTO createdExpectResponse(Long id) {
        return MessageResponseDTO
                .builder()
                .message("Created Person with ID " + id)
                .build();
    }


}
