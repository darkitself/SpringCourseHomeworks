package com.course.springhomeworks.controller.dto;

import com.course.springhomeworks.validator.Max33Min3Mod3;
import com.course.springhomeworks.validator.PositiveAndEven;
import lombok.Getter;

@Getter
public final class DataDTO {
    @PositiveAndEven
    private Integer x;

    @Max33Min3Mod3
    private Integer y;
}
