package com.course.springhomeworks.common;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@ConditionalOnExpression("#{ '${EXAMPLE_TEST}' != 'default' }")
public class Car {
    @PostConstruct
    public void postConstruct() {
        log.info("Car created");
    }
}
