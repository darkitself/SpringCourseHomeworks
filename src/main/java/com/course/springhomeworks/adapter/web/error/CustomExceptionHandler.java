package com.course.springhomeworks.adapter.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> customHandler(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_GATEWAY)
                .body("Sorry, I’m a cat, I have paws. But here’s the error message: " + ex.getLocalizedMessage());
    }
}
