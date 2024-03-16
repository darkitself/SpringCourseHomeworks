package com.course.springhomeworks.validators.validatorsClasses;

import com.course.springhomeworks.validators.Max33Min3Mod3;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Mod3Validator implements ConstraintValidator<Max33Min3Mod3, Integer> {
    @Override
    public void initialize(Max33Min3Mod3 constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer % 3 == 0;
    }
}
