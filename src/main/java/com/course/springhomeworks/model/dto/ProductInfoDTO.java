package com.course.springhomeworks.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductInfoDTO {
    @JsonProperty("date")
    private LocalDate date;
}
