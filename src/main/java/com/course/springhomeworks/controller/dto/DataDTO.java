package com.course.springhomeworks.controller.dto;

import com.course.springhomeworks.validator.Max33Min3Mod3;
import com.course.springhomeworks.validator.PositiveAndMod2;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public final class DataDTO {
    @JsonProperty("x")
    @PositiveAndMod2
    private Integer x;

    @JsonProperty("y")
    @Max33Min3Mod3
    private Integer y;
}
