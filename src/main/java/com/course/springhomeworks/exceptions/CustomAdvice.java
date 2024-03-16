package com.course.springhomeworks.exceptions;

import org.springframework.web;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public ErrorResponse handleBadGateAway(BadGateway ex){
        return new ErrorResponse("BAD_GATEWAY",ex.getLocalizedMessage());
    }
}
