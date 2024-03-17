package com.course.springhomeworks.validator;

import com.course.springhomeworks.validator.validatorsClasses.PositiveAndMod2Validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = PositiveAndMod2Validator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PositiveAndMod2 {
    String message() default "Число x должно соответсвовать условию: x > 0 & x % 2 == 0";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
