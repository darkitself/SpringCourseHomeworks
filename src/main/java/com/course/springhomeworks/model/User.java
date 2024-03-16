package com.course.springhomeworks.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    int id;
    String firstName;
    String middleName;
    String lastName;
    int age;
    String email;
}
