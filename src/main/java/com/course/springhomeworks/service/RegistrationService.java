package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.web.dto.request.RegistrationRequest;
import com.course.springhomeworks.domain.UserEntity;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class RegistrationService {
    PasswordEncoder passwordEncoder;
    InMemoryUserDetailsManager inMemoryUserDetailsManager;
    public void registerUser(RegistrationRequest registrationRequest) {
        String encodedPass = passwordEncoder.encode(registrationRequest.password());
        UserEntity user = new UserEntity(registrationRequest.username(),
                encodedPass,
                registrationRequest.roles(),
                true, true, true, true);
        inMemoryUserDetailsManager.createUser(user);
    }
}
