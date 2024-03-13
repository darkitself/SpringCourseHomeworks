package com.course.springhomeworks.controllers;

import com.course.springhomeworks.models.dto.DataDTO;
import com.course.springhomeworks.services.JsonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping("/json")
public class JsonController {
    private JsonService service;

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> reformatJson(@RequestBody DataDTO data) {
        service.updateData(data);
        return ResponseEntity.ok(service.getUpdatedData());
    }

    @GetMapping(value = "/all", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> reformatJson() {
        return ResponseEntity.ok(service.getDataCollection());
    }
}
