package com.course.springhomeworks.service;

import com.course.springhomeworks.model.DataModel;
import com.course.springhomeworks.model.dto.DataDTO;
import com.course.springhomeworks.model.repository.DataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DataBaseService {
    DataRepository repository;
    public DataModel createTask(DataDTO data) {
        DataModel newData = new DataModel();
        newData.setTaskName(data.getTaskName());
        newData.setTaskList(data.getTaskList());
        return repository.save(newData);
    }

    public List<DataModel> getAllTasks() {
        return repository.findAll();
    }
}
