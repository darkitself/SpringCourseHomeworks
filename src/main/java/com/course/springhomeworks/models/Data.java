package com.course.springhomeworks.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class Data {
    private Double price;
    private Info info;

    @AllArgsConstructor
    @Getter
    @Setter
    public static class Info {
        private int id;
        private Date date;
    }
}
