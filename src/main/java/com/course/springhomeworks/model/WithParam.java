package com.course.springhomeworks.model;

import lombok.Getter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression(value = "!'${myapp.env.var}'.equals('default')")
@Getter
public class WithParam extends Base{
}
