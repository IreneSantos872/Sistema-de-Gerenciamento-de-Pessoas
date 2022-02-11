package com.one.digitalinnovation.personapi.utils;

import com.one.digitalinnovation.personapi.dto.request.PersonDTO;
import com.one.digitalinnovation.personapi.dto.request.PhoneDTO;
import com.one.digitalinnovation.personapi.entity.Person;
import com.one.digitalinnovation.personapi.entity.Phone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class PersonUtils {

    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Santos";
    private static final String CPF_NUMBER = "365.789.586-23";
    private static final long PERSON_ID = 1L;
    private static final LocalDate BIRTH_DATE =  LocalDate.of(1970, 4, 8);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthData("08-05-1970")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthData(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
