package com.course.springhomeworks.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(ForProfile.class)
public class AfterFirst extends Base{
}
