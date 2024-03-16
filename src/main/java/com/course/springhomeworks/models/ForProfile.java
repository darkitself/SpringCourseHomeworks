package com.course.springhomeworks.models;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
@Getter
public class ForProfile {
    @Value("${spring.application.name}")
    private String appName;
}
