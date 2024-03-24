package com.course.springhomeworks.adapter.web.error;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorResponse(String code, String field, String message) {

    public ErrorResponse(String code, String message) {
        this(code, null, message);
    }
}
