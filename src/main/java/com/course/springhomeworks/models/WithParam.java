package com.course.springhomeworks.models;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "myapp.env.var", havingValue = "no_default")
@Getter
public class WithParam {
    @Value("${myapp.env.var}")
    private String var;
}
