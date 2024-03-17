package com.course.springhomeworks.validator.validatorsClasses;

import com.course.springhomeworks.validator.Max33Min3Mod3;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Mod3Validator implements ConstraintValidator<Max33Min3Mod3, Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer % 3 == 0;
    }
}
