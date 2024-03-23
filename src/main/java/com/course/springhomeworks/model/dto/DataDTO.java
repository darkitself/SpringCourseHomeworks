package com.course.springhomeworks.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class DataDTO {
    @JsonProperty("name")
    private String taskName;
    @JsonProperty("events")
    private List<String> taskList;
}
