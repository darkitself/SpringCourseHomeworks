package com.course.springhomeworks.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class PersonEntity {
    String id;
    String phone;
    String name;
    String nickname;

}
