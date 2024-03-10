package com.course.springhomeworks.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class GetController {

    @GetMapping(value = "/headers", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getAllHeaders(@RequestHeader Map<String, String> headers) throws CustomExceptionHandler {
        return ResponseEntity.ok(headers);
    }
}
