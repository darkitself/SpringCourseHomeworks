package com.course.springhomeworks.adapter.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record ToDo(@NotNull @NotBlank String name, List<@NotBlank String> events) {
}
