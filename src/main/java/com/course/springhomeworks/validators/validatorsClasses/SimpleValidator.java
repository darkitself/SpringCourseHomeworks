package com.course.springhomeworks.validators.validatorsClasses;

import com.course.springhomeworks.validators.PositiveAndMod2;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SimpleValidator implements ConstraintValidator<PositiveAndMod2, Integer> {
    @Override
    public void initialize(PositiveAndMod2 constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer > 0 && integer % 2 == 0;
    }
}
