package com.course.springhomeworks.adapter.web;


import com.course.springhomeworks.adapter.web.dto.ToDo;
import com.course.springhomeworks.domain.ToDoEntity;
import com.course.springhomeworks.service.ToDoService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("mesler/v1/todoapi")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ToDoController {
    ToDoService toDoService;
    @PostMapping("/create")
    public ResponseEntity<ToDo> saveToDo(@RequestBody @Valid ToDo toDo){
        toDoService.saveToDo(toDo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getall")
    public List<ToDo> getAllToDo(){
        return toDoService.findAll();
    }
}
