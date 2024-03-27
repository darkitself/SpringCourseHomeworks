package com.course.springhomeworks.controllers;

import com.course.springhomeworks.db.entities.TodoList;
import com.course.springhomeworks.repositories.TodoListRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist")
public class TodoListController {

    private final TodoListRepository toDoListRepository;

    public TodoListController(TodoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @PostMapping("/add")
    public TodoList addToDoList(@RequestBody TodoList toDoList) {
        return toDoListRepository.save(toDoList);
    }

    @GetMapping("/get")
    public List<TodoList> getAllToDoLists() {
        return toDoListRepository.findAll();
    }
}
