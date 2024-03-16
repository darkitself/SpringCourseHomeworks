package com.course.springhomeworks.entities;



import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class Info{
    @Setter
    private int id;
    private final Date date;
    public Info(int id, Date date){
        this.date=date;
        this.id=id;
    }

}
