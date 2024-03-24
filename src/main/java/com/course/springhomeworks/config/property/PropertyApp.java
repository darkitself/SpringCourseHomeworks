package com.course.springhomeworks.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import java.util.List;

@ConfigurationProperties("app")
public class PropertyApp {
    private final String nameApp;
    private final List<String> listApp;
    private final String environmentVariable;

    @ConstructorBinding
    public PropertyApp(String nameApp, List<String> listApp, String environmentVariable) {
        this.nameApp = nameApp;
        this.listApp = listApp;
        this.environmentVariable = environmentVariable;
    }
}