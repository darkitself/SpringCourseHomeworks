package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.repository.ToDoRepository;
import com.course.springhomeworks.adapter.web.dto.ToDo;
import com.course.springhomeworks.domain.ToDoEntity;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ToDoService {
    ToDoRepository toDoRepository;
    public ToDoEntity saveToDo(ToDo toDo) {
        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setName(toDo.name());
        toDoEntity.setEvents(toDo.events());
        return toDoRepository.save(toDoEntity);
    }

    public List<ToDoEntity> findAll() {
        return toDoRepository.findAll();
    }
}
