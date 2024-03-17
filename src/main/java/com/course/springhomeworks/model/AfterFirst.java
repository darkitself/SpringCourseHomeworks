package com.course.springhomeworks.model;

import lombok.Getter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(ForProfile.class)
@Getter
public class AfterFirst extends Base{
}
