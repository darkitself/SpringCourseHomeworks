package com.course.springhomeworks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class InvalidRequestException extends Exception {
    @Override
    public String getMessage() {
        return "Product can not be null";
    }
}
