package com.course.springhomeworks.model;
import jakarta.annotation.Nonnull;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;

import java.util.Arrays;

public abstract class Base implements BeanNameAware {
    private String beanName;
    private String appName;
    private int[] listProp;
    private String var;

    public Base(String appName, int[] listProp, String var) {
        this.appName = appName;
        this.listProp = listProp;
        this.var = var;
    }

    @Override
    public void setBeanName(@Nonnull String name) {
        this.beanName = name;
    }

    @PostConstruct
    public void construct() {
        System.out.printf("%s: appName: %s, list: %s, envVar: %s\n", beanName, appName, Arrays.toString(listProp), var);
    }
}
