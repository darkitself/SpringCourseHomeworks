package com.course.springhomeworks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class HeadersOfGetController {
    @GetMapping("/headers/get/all")
    public ResponseEntity<String> getAllHeaders(@RequestHeader Map<String, String> allHeaders){
        StringBuilder mapWithHeadersAsString = new StringBuilder();
        for (String key : allHeaders.keySet())
        {
            mapWithHeadersAsString.append(key + " : " + allHeaders.get(key) + ", ");
        }
        String headersAsString = mapWithHeadersAsString.toString();
        return ResponseEntity.ok(headersAsString);
    }
}