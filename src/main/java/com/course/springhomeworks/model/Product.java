package com.course.springhomeworks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Product {
    @JsonProperty("price")
    private double price;
    @JsonProperty("info")
    private Info info;
    public Product(){

    }

    public Product(double price, Info info) {
        this.price = price;
        this.info = info;
    }
}
