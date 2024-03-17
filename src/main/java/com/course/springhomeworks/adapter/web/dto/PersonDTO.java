package com.course.springhomeworks.adapter.web.dto;

import com.course.springhomeworks.adapter.web.validation.IsJavaDevConstraint;
import com.course.springhomeworks.adapter.web.validation.NameConstraint;
import com.course.springhomeworks.adapter.web.validation.SkillsConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;


@SkillsConstraint
@IsJavaDevConstraint
public record PersonDTO(
        @NameConstraint String firstName,
        @NameConstraint String lastName,
        @Email(message = "email should be valid") String email,
        boolean isJavaBackEndDev,
        @NotNull List<@NotBlank String> skills
) {
}
