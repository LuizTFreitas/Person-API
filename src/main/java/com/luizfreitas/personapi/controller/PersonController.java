package com.luizfreitas.personapi.controller;

import com.luizfreitas.personapi.dto.MessageResponseDTO;
import com.luizfreitas.personapi.dto.PersonDTO;
import com.luizfreitas.personapi.entity.Person;
import com.luizfreitas.personapi.repository.PersonRepository;
import com.luizfreitas.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }
}
