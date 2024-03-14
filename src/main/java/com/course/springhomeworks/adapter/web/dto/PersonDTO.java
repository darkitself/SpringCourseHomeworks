package com.course.springhomeworks.adapter.web.dto;

import com.course.springhomeworks.adapter.web.validation.SkillsAndJavaDevConstraint;
import com.course.springhomeworks.adapter.web.validation.ValidateName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@SkillsAndJavaDevConstraint
public record PersonDTO(
        String firstName,
        String lastName,
        @Email(message = "email should be valid") String email,
        @NotNull boolean isJavaBackEndDev,
        List<String> skills
) {
}
