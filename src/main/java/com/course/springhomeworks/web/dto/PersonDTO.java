package com.course.springhomeworks.web.dto;

import com.course.springhomeworks.web.validation.CorrectName;
import com.course.springhomeworks.web.validation.CorrectPhone;
import jakarta.validation.constraints.NotBlank;

public record PersonDTO(
        @CorrectPhone
        String phone,
        @CorrectName
        String name,
        @NotBlank
        String nickname) {
}
