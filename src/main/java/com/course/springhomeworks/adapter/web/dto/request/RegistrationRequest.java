package com.course.springhomeworks.adapter.web.dto.request;

import com.course.springhomeworks.domain.UserRole;

import java.util.List;

public record RegistrationRequest(String username, String password, List<UserRole> roles) {
}
