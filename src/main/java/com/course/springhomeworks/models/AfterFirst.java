package com.course.springhomeworks.models;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(ForProfile.class)
@Getter
public class AfterFirst {
    @Value("${myapp.list.values}")
    private int[] listProp;
}
