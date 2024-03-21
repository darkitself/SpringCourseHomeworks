package com.course.springhomeworks.common;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
@Log4j2
public class Worker {

    @PostConstruct
    public void postConstruct() {
        log.info("Worker created");
    }
}
