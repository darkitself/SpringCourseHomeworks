package com.course.springhomeworks.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.time.LocalDate;

@Setter
public class ProductInfo {
    @JsonProperty("price")
    private Double price;
    @JsonProperty("info")
    private Info info;

    @Setter
     public static class Info{
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("date")
        private LocalDate date;
    }
}

