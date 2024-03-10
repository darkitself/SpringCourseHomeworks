package com.course.springhomeworks.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductDTO {
    @JsonProperty("price")
    private double price;
    @JsonProperty("info")
    private ProductInfoDTO info;
}
