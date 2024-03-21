package com.course.springhomeworks.common;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@ConditionalOnBean(value = Worker.class)
@Component
@Log4j2
public class Factory {

    @PostConstruct
    public void postConstruct() {
        log.info("Factory created");
    }
}
