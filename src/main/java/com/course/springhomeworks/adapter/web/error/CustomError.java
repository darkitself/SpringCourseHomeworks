package com.course.springhomeworks.adapter.web.error;

import lombok.Getter;

@Getter
public class CustomError extends RuntimeException{
    private final String errorMessage = "¯\\_( ͡° ͜ʖ ͡°)_/¯";
}
