package com.course.springhomeworks.model.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    @JsonProperty("price")
    private double price;
    @JsonProperty("info")
    private InfoDTO infoDTO;
    public ProductDTO(double price, InfoDTO infoDTO){
        this.price = price;
        this.infoDTO = infoDTO;
    }
}
