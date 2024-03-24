package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.common.Data;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/data", produces = APPLICATION_JSON_VALUE)
public class DataController {

    @PostMapping
    public Data createData(@Valid @RequestBody Data data) {
        //add in database
        return data;
    }
}
