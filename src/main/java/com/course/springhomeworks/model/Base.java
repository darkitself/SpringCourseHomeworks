package com.course.springhomeworks.model;

import jakarta.annotation.Nonnull;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

public abstract class Base implements BeanNameAware {
    private String beanName;
    @Value("${spring.application.name}")
    private String appName;
    @Value("${myapp.list.values}")
    private int[] listProp;
    @Value("${myapp.env.var}")
    private String var;

    @Override
    public void setBeanName(@Nonnull String name) {
        this.beanName = name;
    }

    @PostConstruct
    public void construct() {
        System.out.printf("%s: appName: %s, list: %s, envVar: %s\n", beanName, appName, Arrays.toString(listProp), var);
    }
}
