package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SkillsValidator.class)
@Target({ElementType.PARAMETER, ElementType.TYPE})
public @interface SkillsConstraint {
    String message() default "Вы должны знать как минимум про validation";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
