package com.course.springhomeworks.adapter.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record ToDoListDTO(@NotBlank String name, @NotNull List<@NotBlank String> events) {
}
