package com.course.springhomeworks.adapter.web.dto;

import com.course.springhomeworks.adapter.web.validation.AgeConstraint;
import com.course.springhomeworks.adapter.web.validation.FullName;
import jakarta.validation.constraints.Email;

@FullName
public record UserDTO(String firstName,
                      String middleName,
                      String lastName,
                      @AgeConstraint()
                      int age,
                      @Email(message = "email should be valid")
                      String email){
}
