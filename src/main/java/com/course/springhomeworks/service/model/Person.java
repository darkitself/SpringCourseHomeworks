package com.course.springhomeworks.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class Person {
    private Integer id;
    private String phone;
    private String name;
    private String nickname;
}
