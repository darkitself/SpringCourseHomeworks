package com.course.springhomeworks.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression(value = "!'${myapp.env.var}'.equals('default')")
public class WithParam extends Base{
}
