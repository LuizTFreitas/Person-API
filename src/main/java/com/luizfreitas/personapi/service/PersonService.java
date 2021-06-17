package com.luizfreitas.personapi.service;

import com.luizfreitas.personapi.dto.MessageResponseDTO;
import com.luizfreitas.personapi.entity.Person;
import com.luizfreitas.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

// Onde vem todas as regras de negócio da nossa aplicação
@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with Id " + savedPerson.getId())
                .build();
    }
}
