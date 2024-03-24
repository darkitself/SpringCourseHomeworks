package com.course.springhomeworks.adapter.web.dto;

import com.course.springhomeworks.domain.CaseEntity;
import lombok.AllArgsConstructor;

import java.util.List;

public record ResponseDto(String name, List<String> events) {

}
