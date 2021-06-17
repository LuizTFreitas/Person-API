package com.luizfreitas.personapi.repository;

import com.luizfreitas.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}