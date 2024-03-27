package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.adapter.web.dto.request.RegistrationRequest;
import com.course.springhomeworks.service.RegistrationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/api")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class RegistrationController {
    RegistrationService registrationService;

    @PostMapping("/registration")
    public void registration(@RequestBody RegistrationRequest registrationRequest) {
        registrationService.registerUser(registrationRequest);
    }
}
