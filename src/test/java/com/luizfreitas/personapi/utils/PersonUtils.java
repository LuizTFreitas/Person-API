package com.luizfreitas.personapi.utils;

import com.luizfreitas.personapi.dto.request.PersonDTO;
import com.luizfreitas.personapi.entities.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Luiz";
    private static final String LAST_NAME = "Freitas";
    private static final String CPF_NUMBER = "405.290.698-57";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .fname(FIRST_NAME)
                .lname(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .adresses(Collections.singletonList(AdressUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .fname(FIRST_NAME)
                .lname(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .adresses(Collections.singletonList(AdressUtils.createFakeEntity()))
                .build();
    }
}
