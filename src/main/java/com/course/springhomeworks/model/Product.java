package com.course.springhomeworks.model;

import com.course.springhomeworks.model.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Product extends ProductDTO {
    @JsonProperty("info")
    private ProductInfo info;
}
