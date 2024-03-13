package com.course.springhomeworks;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class JsonController {

    private Integer idCounter = 0;

    @PostMapping("/json")
    public ResponseEntity<Map<String, Object>> processJson(@RequestBody Map<String, Object> json) {
        var info = (Map<String, Object>) json.get("info");

        info.put("id", ++idCounter);
        return ResponseEntity.ok(json);
    }
}