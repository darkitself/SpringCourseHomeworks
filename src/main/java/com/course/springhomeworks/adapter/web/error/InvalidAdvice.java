package com.course.springhomeworks.adapter.web.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class InvalidAdvice extends ResponseEntityExceptionHandler {
    public static final String VALIDATION_ERROR = "validation error";
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<InvalidResponse> list = new ArrayList<>();
        for (FieldError fieldError : ex.getBindingResult()
                .getFieldErrors()) {
            InvalidResponse invalidResponse = new InvalidResponse(VALIDATION_ERROR, fieldError.getField(), fieldError.getDefaultMessage());
            list.add(invalidResponse);
        }
        var errors = new ArrayList<>(list);
        List<InvalidResponse> result = new ArrayList<>();
        for (ObjectError e : ex.getBindingResult().getGlobalErrors()) {
            InvalidResponse invalidResponse = new InvalidResponse(VALIDATION_ERROR, e.getDefaultMessage());
            result.add(invalidResponse);
        }
        errors.addAll(result);
        return ResponseEntity.badRequest()
                .body(errors);
    }
}
