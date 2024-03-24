package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.adapter.web.dto.ResponseDto;
import com.course.springhomeworks.adapter.web.dto.ToDoListDTO;
import com.course.springhomeworks.domain.ToDoListEntity;
import com.course.springhomeworks.service.ToDoListService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Validated
public class ToDoController {
    ToDoListService toDoListService;
    @PostMapping("/createToDo")
    public void createToDo(@Valid @RequestBody ToDoListDTO toDoListDTO){
        toDoListService.createToDo(toDoListDTO);
    }
    @GetMapping("/getAll")
    public List<ResponseDto> getAllToDoLists(){
        return toDoListService.getAllToDo();
    }
}