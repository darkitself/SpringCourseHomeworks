package com.course.springhomeworks.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(double id){
        super("can`t find product in database with id - " + id);
    }
}
