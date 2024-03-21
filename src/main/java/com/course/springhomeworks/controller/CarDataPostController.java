// По-сути - старт процесса. Именно тут постзапросом будет подаваться объект на отработку валидации
package com.course.springhomeworks.controller;

import com.course.springhomeworks.dto.CarDataDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class CarDataPostController {
    @PostMapping("/car/data/check")
    public ResponseEntity<?> checkDataValid(@Valid @RequestBody CarDataDTO carData) {
        return ResponseEntity.ok(carData);
    }
}
