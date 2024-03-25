package com.course.springhomeworks.adapter.web.controller;

import com.course.springhomeworks.adapter.web.dto.Data;
import com.course.springhomeworks.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/data")
public class DataController {

    private final DataService dataService;

    @PostMapping
    public Data createData(@RequestBody Data data) {
        return dataService.createData(data);
    }

    @GetMapping
    public List<Data> getData() {
        return dataService.getData();
    }
}
