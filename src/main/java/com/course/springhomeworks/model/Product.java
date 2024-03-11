package com.course.springhomeworks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {
    @JsonProperty("price")
    @NonNull
    private double price;
    @JsonProperty("info")
    @NonNull
    private Info info;
}
