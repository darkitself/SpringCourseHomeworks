package com.course.springhomeworks.web.dto;

import java.time.LocalDate;

public record ProductInfoDTO(Double price, InfoDTO info){
    public record InfoDTO (LocalDate date){
    }
}