package com.course.springhomeworks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
public class ProductInfo {
    @JsonProperty("id")
    private int id;
    @JsonProperty("date")
    private LocalDate date;
}
