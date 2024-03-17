package com.course.springhomeworks.service;


import com.course.springhomeworks.service.model.Person;
import com.course.springhomeworks.web.dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PhonebookService {
    private static Map<Integer, Person> phonebook = new ConcurrentHashMap<>();
    public static Integer addDB(PersonDTO personDTO) {
        var person = new Person();
        var index = phonebook.size() + 1;
        person.setId(index);
        person.setPhone(personDTO.phone());
        person.setName(personDTO.name());
        person.setNickname(personDTO.nickname());
        phonebook.put(index, person);
        return index;
    }
}
