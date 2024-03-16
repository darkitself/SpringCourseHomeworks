package com.course.springhomeworks.adapter.web.validation;

import com.course.springhomeworks.adapter.web.dto.UserDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FullNameValidator implements ConstraintValidator<FullName, UserDTO> {
    @Override
    public boolean isValid(UserDTO value, ConstraintValidatorContext context) {
        if (value.firstName().isEmpty() ||
                value.middleName().isEmpty() ||
                value.lastName().isEmpty()){
            return false;
        }
        StringBuilder fullName=new StringBuilder(value.firstName());
        fullName.append(" "+value.middleName());
        fullName.append(" "+value.lastName());
        if (fullName.length()>123){
            return false;
        }
        if (!fullName.toString().matches("[a-zA-Z]+ [a-zA-Z]+ [a-zA-Z]+")){
            return false;
        }
        return true;
    }
}
