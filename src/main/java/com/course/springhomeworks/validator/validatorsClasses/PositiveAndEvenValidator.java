package com.course.springhomeworks.validator.validatorsClasses;

import com.course.springhomeworks.validator.PositiveAndEven;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PositiveAndEvenValidator implements ConstraintValidator<PositiveAndEven, Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer > 0 && integer % 2 == 0;
    }
}
