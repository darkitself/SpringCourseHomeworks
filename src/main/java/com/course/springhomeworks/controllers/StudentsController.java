package com.course.springhomeworks.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class StudentsController {

    @GetMapping("/getStudents")
    public ResponseEntity<String> getAllStudentsData(@RequestHeader Map<String, String> studentHeaders){
        return new ResponseEntity<String>(String.valueOf(studentHeaders), HttpStatus.OK);
    }

}
