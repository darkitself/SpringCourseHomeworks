package com.course.springhomeworks.service.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
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

