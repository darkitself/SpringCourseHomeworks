package com.course.springhomeworks.common;


import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestValue {
    @PostConstruct
    public void postConstruct() {
        log.info("BeanTest created");
    }
}
