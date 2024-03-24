package com.course.springhomeworks.common;

import com.course.springhomeworks.validation.EmailConstraint;
import com.course.springhomeworks.validation.IdConstraint;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Data {

    @EmailConstraint
    private String email;

    @IdConstraint
    private String id;
}
