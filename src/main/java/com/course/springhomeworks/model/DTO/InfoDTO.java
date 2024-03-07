package com.course.springhomeworks.model.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public class InfoDTO {
    @JsonProperty("date")
    private String date;
    public InfoDTO(String date){
        this.date = date;
    }
}
