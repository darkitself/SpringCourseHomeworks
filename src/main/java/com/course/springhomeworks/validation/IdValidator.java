package com.course.springhomeworks.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdValidator implements ConstraintValidator<IdConstraint, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.isBlank()) {
            return false;
        }

        if (s.length() < 8) {
            return false;
        }

        if (s.charAt(0) != 'i' || s.charAt(1) != 'd') {
            return false;
        }

        return true;
    }
}
