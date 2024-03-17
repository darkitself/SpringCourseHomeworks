package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.web.dto.PersonDTO;
import com.course.springhomeworks.domain.PersonOnIntern;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PersonService {
    Map<Long, PersonOnIntern> people = new ConcurrentHashMap<>();
    public PersonOnIntern addToIntern(PersonDTO personDTO){
        Long id = (long) (people.size() + 1);
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = currentDate.plusMonths(6);
        PersonOnIntern person = PersonOnIntern.of(id, personDTO.firstName(), personDTO.lastName(), personDTO.email(),endDate);
        people.put(id, person);
        return person;
    }
}
