package com.course.springhomeworks.adapter;

import com.course.springhomeworks.model.DataModel;
import com.course.springhomeworks.model.dto.DataDTO;
import com.course.springhomeworks.service.DataBaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DataController {
    DataBaseService service;

    @PostMapping(value = "/create")
    public ResponseEntity<DataModel> createData(@RequestBody DataDTO data) {
        return ResponseEntity.ok(service.createTask(data));
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<DataModel>> getAll() {
        return ResponseEntity.ok(service.getAllTasks());
    }
}
