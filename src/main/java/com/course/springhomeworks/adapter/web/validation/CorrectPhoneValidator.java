package com.course.springhomeworks.adapter.web.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class CorrectPhoneValidator implements ConstraintValidator<CorrectPhone, String> {
    @Override
    public boolean isValid(String contactField,
                           ConstraintValidatorContext cxt) {
        return contactField != null && (contactField.matches("^(\\+7)([0-9]{10})$")
                || contactField.matches("^(8)([0-9]{10})$"));
    }

}