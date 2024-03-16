package com.course.springhomeworks.controllers;

import com.course.springhomeworks.dto.DataDTO;
import com.course.springhomeworks.services.MyService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@AllArgsConstructor
public class MyController {
    private MyService myService;

    @PostMapping(value = "/", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> checkValid(@Valid @RequestBody DataDTO data) {
        return ResponseEntity.ok(data);
    }

    @GetMapping(value = "/beans")
    public ResponseEntity<?> beansAttr() {
        return ResponseEntity.ok(myService.getAppName() + " " + myService.getList() + " " + myService.getVar());
    }
}
