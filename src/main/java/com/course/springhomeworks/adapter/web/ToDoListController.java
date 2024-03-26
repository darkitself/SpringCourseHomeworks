package com.course.springhomeworks.adapter.web;

import com.course.springhomeworks.adapter.web.dto.ToDoListDTO;
import com.course.springhomeworks.adapter.web.dto.ToDoListResponse;
import com.course.springhomeworks.domain.ToDoListEntity;
import com.course.springhomeworks.service.ToDoListService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping(value = "/todolist/", produces = APPLICATION_JSON_VALUE)
public class ToDoListController {

    private final ToDoListService toDoListService;

    @PostMapping("/addToDo")
    public ToDoListEntity postToDoList (@RequestBody ToDoListDTO toDoListDTO) {
        return toDoListService.addDB(toDoListDTO);
    }

    @GetMapping("/getAllToDoList")
    public List<ToDoListResponse> getAllToDoList(){
        return toDoListService.getDB();
    }
}
