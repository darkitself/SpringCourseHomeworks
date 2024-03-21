package com.course.springhomeworks.adapter.web;


import com.course.springhomeworks.adapter.web.dto.ToDo;
import com.course.springhomeworks.domain.ToDoEntity;
import com.course.springhomeworks.service.ToDoService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
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
    public ToDoEntity saveToDo(@RequestBody @Valid ToDo toDo){
        return toDoService.saveToDo(toDo);
    }

    @GetMapping("/getall")
    public List<ToDoEntity> getAllToDo(){
        return toDoService.findAll();
    }
}
