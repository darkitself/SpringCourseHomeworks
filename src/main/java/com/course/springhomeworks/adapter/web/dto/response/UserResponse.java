package com.course.springhomeworks.adapter.web.dto.response;

import java.util.List;

public record UserResponse(String name, List<String> role) {
}
