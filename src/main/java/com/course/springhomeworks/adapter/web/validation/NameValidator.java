package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameConstraint, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean isDigit = false;
        boolean minSize20 = s.length() <= 20;
        char[] chars = s.toCharArray();
        for(char c : chars){
            if (Character.isDigit(c)){
                isDigit = true;
                break;
            }
        }
        return !isDigit && !s.isEmpty() && minSize20;
    }
}
