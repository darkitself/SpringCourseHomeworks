package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.repository.ToDoRepository;
import com.course.springhomeworks.adapter.web.dto.ToDo;
import com.course.springhomeworks.domain.EventEntity;
import com.course.springhomeworks.domain.ToDoEntity;
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
public class ToDoService {
    ToDoRepository toDoRepository;
    @Transactional
    public ToDoEntity saveToDo(ToDo toDo) {
        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setName(toDo.name());
        List<EventEntity> events = new ArrayList<>();
        for(String event : toDo.events()) {
            EventEntity eventEntity = new EventEntity();
            eventEntity.setEventName(event);
            events.add(eventEntity);
        }
        toDoEntity.setEvents(events);
        return toDoRepository.save(toDoEntity);
    }

    public List<ToDo> findAll() {
        List<ToDoEntity> toDoEntities = toDoRepository.findAll();
        List<ToDo> responseToDoList = new ArrayList<>();
        for(ToDoEntity toDoEntity : toDoEntities) {
            List<EventEntity> events = toDoEntity.getEvents();
            List<String> eventsStr = new ArrayList<>();
            for(EventEntity event : events) {
                eventsStr.add(event.getEventName());
            }
            ToDo toDo = new ToDo(toDoEntity.getName(), eventsStr);
            responseToDoList.add(toDo);
        }
        return responseToDoList;
    }
}
