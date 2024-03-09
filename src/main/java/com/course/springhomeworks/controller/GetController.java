package com.course.springhomeworks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetController {
    @GetMapping("/getHeaders")
    public static String getHeaders(@RequestHeader Map<String, String> headers){
        StringBuilder allHeaders=new StringBuilder();
        headers.forEach((key, value) -> {
            allHeaders.append(String.format("Header '%s' = %s%n", key, value));
        });
        return allHeaders.toString();
    }
}
