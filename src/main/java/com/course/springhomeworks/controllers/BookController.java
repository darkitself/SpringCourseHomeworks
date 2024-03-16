package com.course.springhomeworks.controllers;

import com.example.javacourse.entities.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BookController {
    @PostMapping("/postStudents")
    public ResponseEntity<Book> postAllStudentsData(@RequestBody Book book, int id){
        book.getInfo().setId(id);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }
}
