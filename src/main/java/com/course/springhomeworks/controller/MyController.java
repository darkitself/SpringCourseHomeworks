package com.course.springhomeworks.controller;

import com.course.springhomeworks.controller.dto.DataDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Validated
public class MyController {
    @PostMapping(value = "/", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> checkValid(@Valid @RequestBody DataDTO data) {
        return ResponseEntity.ok(data);
    }
}
