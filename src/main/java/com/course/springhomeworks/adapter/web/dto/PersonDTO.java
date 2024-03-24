package com.course.springhomeworks.adapter.web.dto;

import com.course.springhomeworks.adapter.web.validation.CorrectName;
import com.course.springhomeworks.adapter.web.validation.CorrectPhone;
import jakarta.validation.constraints.NotBlank;

public record PersonDTO(
        @CorrectPhone
        String phone,
        @CorrectName
        String name,
        @NotBlank
        String nickname) {
}
