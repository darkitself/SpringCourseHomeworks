package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidator.class)
public @interface NameConstraint {
    String message() default "Имя/Фамилия должны быть не пустыми, не превышать 20 знаков, не должны содержать цифр";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
