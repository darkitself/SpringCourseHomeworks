package com.course.springhomeworks.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class CustomException {
    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<String> handleBadGatewayException(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("502 error: " + e.getMessage());
    }
}
