package com.course.springhomeworks.adapter.web.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;

@RestControllerAdvice
public class InvalidAdvice extends ResponseEntityExceptionHandler {
    public static final String VALIDATION_ERROR = "validation error";
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        var errors = new ArrayList<>(ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(e -> new InvalidResponse(VALIDATION_ERROR, e.getField(), e.getDefaultMessage())).toList());
        errors.addAll(ex.getBindingResult().getGlobalErrors().stream()
                .map(e -> new InvalidResponse(VALIDATION_ERROR, e.getDefaultMessage())).toList());
        return ResponseEntity.badRequest()
                .body(errors);
    }
}
