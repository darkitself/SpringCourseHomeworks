package com.course.springhomeworks.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ItIsNameVal.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItIsName {
    String message() default "Имя дожно состоять только из букв кириллического алфавита";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
