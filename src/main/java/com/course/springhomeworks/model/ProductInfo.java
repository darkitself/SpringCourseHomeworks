package com.course.springhomeworks.model;

import com.course.springhomeworks.model.dto.ProductInfoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Getter
@Setter
public class ProductInfo extends ProductInfoDTO {
    @JsonProperty("id")
    private int id;
}
