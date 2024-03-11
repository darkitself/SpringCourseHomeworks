package com.course.springhomeworks.controller.advice;

import com.course.springhomeworks.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProductNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public Map<String, String> exceptionHandler(ProductNotFoundException productNotFoundException){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", productNotFoundException.getMessage());
        return errorMap;
    }
}
