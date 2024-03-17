package com.course.springhomeworks.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.CopyOnWriteArrayList;

@Data
@ConfigurationProperties("app")
public class Property {
    CopyOnWriteArrayList<Integer> values;
    String appName;
    String environmentVariable;
}
