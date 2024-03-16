package com.course.springhomeworks.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class IdAddController {
    @PostMapping("/someJson")
    public ResponseEntity<Map<String, Object>> editSomeJson(@RequestBody Map<String, Object> someJson) {
        Map<String, Object> info = (Map<String, Object>) someJson.get("info");
        int randomId = (int) (Math.random()*(1000-0)+0);
        info.put("id", randomId);
        someJson.put("info", info);
        return ResponseEntity.ok(someJson);
    }
}