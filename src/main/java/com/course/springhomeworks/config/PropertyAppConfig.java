package com.course.springhomeworks.config;

import com.course.springhomeworks.config.property.PropertyApp;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PropertyApp.class)
public class PropertyAppConfig {
}
