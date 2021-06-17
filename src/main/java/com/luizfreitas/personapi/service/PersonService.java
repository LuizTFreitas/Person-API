package com.luizfreitas.personapi.service;

import com.luizfreitas.personapi.dto.MessageResponseDTO;
import com.luizfreitas.personapi.dto.PersonDTO;
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

    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO){
        Person personToSave = Person.builder()
                .fname(personDTO.getFname())
                .lname((personDTO.getLname()))
                .cpf(personDTO.getCpf())
                .birthDate(personDTO.getBirthDate())
                .phones(personDTO.getPhones())
                .adresses(personDTO.getAdresses())
                .build();

        Person savedPerson = personRepository.save(personDTO);
        return MessageResponseDTO
                .builder()
                .message("Created personDTO with Id " + savedPerson.getId())
                .build();
    }
}
