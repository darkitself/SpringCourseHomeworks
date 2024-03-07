package com.course.springhomeworks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class GetHeadersController {
    @GetMapping("/httpHeaderList")
    public ResponseEntity<String> headers (@RequestHeader Map<String, String> httpHeaders){
        List<String> headers = new ArrayList<>();
        httpHeaders.forEach((k, v) -> {
           headers.add(k + " " + v);
        });
        return new ResponseEntity<String>(headers.toString(),HttpStatus.OK);
    }
}
