package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.adapter.web.dto.response.UserResponse;
import com.course.springhomeworks.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RequestMapping("/public/api")
public class PublicController {
    UserService userService;
    @GetMapping("/get")
    public UserResponse getAuthPublic() {
        return userService.getCurrentUser();
    }
}
