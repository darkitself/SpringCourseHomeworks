package com.course.springhomeworks.adapter.web.controller;

import com.course.springhomeworks.adapter.web.dto.UserDTO;
import com.course.springhomeworks.model.User;
import com.course.springhomeworks.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class UserController {
    UserService userService;
    @PostMapping("/user")
    public User createUser(@Valid @RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }
}
