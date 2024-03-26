package com.course.springhomeworks.adapter.web.dto;

import java.util.List;

public record ToDoListResponse (Long id, String name, List<String> events){
}
