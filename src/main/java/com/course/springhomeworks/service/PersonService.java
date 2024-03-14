package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.web.dto.PersonDTO;
import com.course.springhomeworks.domain.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PersonService {
    Map<Long, Person> people = new ConcurrentHashMap<>();
    public Person addToIntern(PersonDTO personDTO){
        Long id = (long) (people.size() + 1);
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = currentDate.plusMonths(6);
        people.put(id, Person.of(id, personDTO.firstName(), personDTO.lastName(), personDTO.email(),endDate));

        return people.get(id);
    }
}
