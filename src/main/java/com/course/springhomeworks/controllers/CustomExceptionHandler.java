package com.course.springhomeworks.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class CustomExceptionHandler extends Throwable {

    @ExceptionHandler(HttpServerErrorException.BadGateway.class)
    public ResponseEntity<String> handleBadGatewayException(HttpServerErrorException.BadGateway ex) {
        String errorMessage = "Custom 502 Bad Gateway Error: " + ex.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(errorMessage);
    }
}
