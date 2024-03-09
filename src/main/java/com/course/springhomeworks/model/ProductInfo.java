package com.course.springhomeworks.model;

import com.course.springhomeworks.model.dto.ProductInfoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Getter
@Setter
@RequiredArgsConstructor
public class ProductInfo {
    @JsonProperty("id")
    private int id;
    @JsonProperty("date")
    private Date date;
}
