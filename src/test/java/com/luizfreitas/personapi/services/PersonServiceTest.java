package com.luizfreitas.personapi.services;

import com.luizfreitas.personapi.repositories.PersonRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    private PersonRepository personRepository;

    private PersonService personService;
}
