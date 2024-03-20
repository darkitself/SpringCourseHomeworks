package com.course.springhomeworks.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("app")
public class PropertyApp {
    String nameApp;
    List<String> listApp;
    String environmentVariable;
}