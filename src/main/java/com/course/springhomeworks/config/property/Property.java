package com.course.springhomeworks.config.property;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@Data
@ConfigurationProperties("app")
@Component
public class Property {
    CopyOnWriteArrayList<Integer> values;
    String appName;
    String environmentVariable;
}
