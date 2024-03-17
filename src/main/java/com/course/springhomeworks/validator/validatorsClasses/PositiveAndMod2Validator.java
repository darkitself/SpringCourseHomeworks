package com.course.springhomeworks.validator.validatorsClasses;

import com.course.springhomeworks.validator.PositiveAndMod2;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PositiveAndMod2Validator implements ConstraintValidator<PositiveAndMod2, Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer > 0 && integer % 2 == 0;
    }
}
