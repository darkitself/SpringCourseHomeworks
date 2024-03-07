package com.course.springhomeworks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Info {
    @JsonProperty("id")
    private int id;
    @JsonProperty("date")
    private String date;
    public Info(){

    }
    public Info(int id, String date){
        this.id = id;
        this.date = date;
    }
}
