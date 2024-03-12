package com.course.springhomeworks.adapter.web.controller;

import com.course.springhomeworks.adapter.web.dto.DataIn;
import com.course.springhomeworks.service.DataService;
import com.course.springhomeworks.service.common.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/data", produces = APPLICATION_JSON_VALUE)
public class DataController {
    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping
    Data generateId(@RequestBody DataIn data) {
        return dataService.createData(data);
    }
}
