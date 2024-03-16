package com.course.springhomeworks.validators;

import com.course.springhomeworks.validators.validatorsClasses.SimpleValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = SimpleValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PositiveAndMod2 {
    String message() default "Число x должно соответсвовать условию: x > 0 & x % 2 == 0";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
