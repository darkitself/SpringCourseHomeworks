package com.course.springhomeworks.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @JsonProperty("price")
    @NonNull
    private double price;
    @JsonProperty("info")
    @NonNull
    private InfoDTO infoDTO;
}
