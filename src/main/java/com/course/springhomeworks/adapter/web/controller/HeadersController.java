package com.course.springhomeworks.adapter.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/headers")
public class HeadersController {

    @GetMapping
    Map<String, String> responseAllHeaders(@RequestHeader Map<String, String> headers) {
        return headers;
    }
}
