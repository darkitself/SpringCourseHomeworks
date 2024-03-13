package com.course.springhomeworks.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Getter
public class DataDTO {
    @JsonProperty("price")
    private Double price;
    @JsonProperty("info")
    private Info info;

    @RequiredArgsConstructor
    @Getter
    public static class Info {
        @JsonProperty("date")
        private Date date;
    }
}
