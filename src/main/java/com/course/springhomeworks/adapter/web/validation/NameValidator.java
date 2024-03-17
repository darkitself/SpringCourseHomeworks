package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameConstraint, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean isDigit = false;
        char[] chars = s.toCharArray();
        for(char c : chars){
            if (Character.isDigit(c)){
                isDigit = true;
                break;
            }
        }
        return !isDigit;
    }
}
