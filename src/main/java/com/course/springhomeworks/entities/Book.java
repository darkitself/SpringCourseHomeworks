package com.course.springhomeworks.entities;


import lombok.Getter;


@Getter
public class Book {
    private final int price;
    private Info info;
    public Book(int price, Info info) {
        this.price = price;
        this.info = info;
    }
}

