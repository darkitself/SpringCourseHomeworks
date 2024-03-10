package com.course.springhomeworks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    @JsonProperty("id")
    @NonNull
    private int id;
    @JsonProperty("date")
    @NonNull
    private LocalDate date;
}
