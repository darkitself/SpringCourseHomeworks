package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.repository.ToDoListRepository;
import com.course.springhomeworks.adapter.web.dto.ToDoListDTO;
import com.course.springhomeworks.adapter.web.dto.ToDoListResponse;
import com.course.springhomeworks.domain.ToDoListEntity;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ToDoListService {
    private final ToDoListRepository toDoListRepository;

    public ToDoListEntity addDB(ToDoListDTO toDoListDTO) {
        var toDoListEntity  = new ToDoListEntity();
        toDoListEntity.setName(toDoListDTO.name());
        toDoListEntity.setToDoList(toDoListDTO.events());
        return toDoListRepository.save(toDoListEntity);
    }

    public List<ToDoListResponse> getDB () {
        return toDoListRepository.findAll()
                .stream()
                .map((entity) ->
                        new ToDoListResponse(entity.getId(), entity.getName(), entity.getToDoList()))
                .toList();
    }
}
