package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.adapter.web.dto.response.UserResponse;
import com.course.springhomeworks.service.UserService;
import jakarta.annotation.security.RolesAllowed;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RolesAllowed("ADMIN")
@RequestMapping("/admin/api")
public class AdminController {
    UserService userService;
    @GetMapping("/get")
    public UserResponse getAuthAdmin() {
        return userService.getCurrentUser();
    }
}
