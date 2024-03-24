package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.repository.CaseRepository;
import com.course.springhomeworks.adapter.repository.ToDoRepository;
import com.course.springhomeworks.adapter.web.dto.ResponseDto;
import com.course.springhomeworks.adapter.web.dto.ToDoListDTO;
import com.course.springhomeworks.domain.CaseEntity;
import com.course.springhomeworks.domain.ToDoListEntity;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Transactional
public class ToDoListService {
    ToDoRepository toDoRepository;
    CaseRepository caseRepository;
    public ToDoListEntity createToDo(ToDoListDTO toDoListDTO){
        ToDoListEntity toDoListEntity = new ToDoListEntity(toDoListDTO.name());
        List<CaseEntity> caseEntities = new ArrayList<>();
        for (String eventName: toDoListDTO.events()) {
            CaseEntity caseEntity = new CaseEntity(eventName);
            caseEntity.setToDoList(toDoListEntity);
            caseEntities.add(caseEntity);
        }
        toDoListEntity.setEvents(caseEntities);
        return toDoRepository.save(toDoListEntity);
    }
    public List<ResponseDto> getAllToDo(){
        List<ToDoListEntity> toDoListEntities= toDoRepository.findAll();
        List<ResponseDto> responseDtoList = new ArrayList<>();
        for (ToDoListEntity todoList:toDoListEntities) {
            List<String> caseList = new ArrayList<>();
            for (CaseEntity todo:todoList.getEvents()) {
                caseList.add(todo.getName());
            }
            responseDtoList.add(new ResponseDto(todoList.getName(),caseList));
        }
        return responseDtoList;
    }

}
