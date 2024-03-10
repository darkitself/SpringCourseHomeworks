package com.course.springhomeworks.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    @JsonProperty("price")
    private double price;
    @JsonProperty("info")
    private ProductInfoDTO info;
}
