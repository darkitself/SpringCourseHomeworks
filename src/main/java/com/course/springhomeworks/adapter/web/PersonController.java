package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.adapter.web.dto.PersonDTO;
import com.course.springhomeworks.domain.PersonOnIntern;
import com.course.springhomeworks.service.PersonService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SKBLabIntern/api/v1")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Validated
public class PersonController {
    PersonService personService;
    @PostMapping("/addIntern")
    public PersonOnIntern addPersonToIntern(@Valid @RequestBody PersonDTO personDTO){
        return personService.addToIntern(personDTO);
    }
}
