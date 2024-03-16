package com.course.springhomeworks.dto;

import com.course.springhomeworks.validators.Max33Min3Mod3;
import com.course.springhomeworks.validators.PositiveAndMod2;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDTO {
    @JsonProperty("x")
    @PositiveAndMod2
    private Integer x;

    @JsonProperty("y")
    @Max33Min3Mod3
    private Integer y;
}
