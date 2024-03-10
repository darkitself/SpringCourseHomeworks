package com.course.springhomeworks.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class JsonController {

    private int id = 0;

    @PostMapping(value = "/json", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> reformatJson(@RequestBody Map<String, Object> data) {
        Map<String, Object> info = new LinkedHashMap<>();
        info.put("id", id++);
        info.put("data", ((Map<String, Object>) data.get("info")).get("data"));

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("price", data.get("price"));
        response.put("info", info);

        return ResponseEntity.ok(response);
    }
}
