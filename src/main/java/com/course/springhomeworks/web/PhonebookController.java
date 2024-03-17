package com.course.springhomeworks.web;


import com.course.springhomeworks.service.PhonebookService;
import com.course.springhomeworks.service.model.Person;
import com.course.springhomeworks.web.dto.PersonDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@Validated
@RequestMapping(value = "/phonebook/", produces = APPLICATION_JSON_VALUE)
public class PhonebookController {

    @PostMapping("/addPerson")
    public static Integer postPerson (@Valid @RequestBody PersonDTO personDTO) {
        return PhonebookService.addDB(personDTO);
    }
}