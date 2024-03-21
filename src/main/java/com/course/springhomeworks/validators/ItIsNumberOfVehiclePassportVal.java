package com.course.springhomeworks.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ItIsNumberOfVehiclePassportVal implements ConstraintValidator<ItIsNumberOfVehiclePassport, Integer> {
    @Override
    public boolean isValid(Integer numberOfVP, ConstraintValidatorContext constraintValidatorContext) {
        return  (numberOfVP != 555555);
    }
}
