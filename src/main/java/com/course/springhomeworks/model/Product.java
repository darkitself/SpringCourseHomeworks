package com.course.springhomeworks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @JsonProperty("price")
    @NonNull
    private double price;
    @JsonProperty("info")
    @NonNull
    private Info info;
}
