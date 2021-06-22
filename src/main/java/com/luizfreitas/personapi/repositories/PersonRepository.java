package com.luizfreitas.personapi.repositories;

import com.luizfreitas.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}