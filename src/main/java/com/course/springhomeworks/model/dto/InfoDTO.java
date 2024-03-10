package com.course.springhomeworks.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class InfoDTO {
    @JsonProperty("date")
    @NonNull
    private LocalDate date;
}