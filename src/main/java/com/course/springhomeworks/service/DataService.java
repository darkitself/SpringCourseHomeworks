package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.repository.DataRepository;
import com.course.springhomeworks.adapter.web.dto.Data;
import com.course.springhomeworks.domain.DataEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DataService {

    private final DataRepository dataRepository;

    public Data createData(Data data) {
        DataEntity dataEntity = dataRepository.save(new DataEntity(data.name(), data.events()));

        Data newData = new Data(dataEntity.getName(), dataEntity.getEvents());
        return newData;
    }

    public List<Data> getData() {
        List<DataEntity> dataEntityList = dataRepository.findAll();
        List<Data> dataList = dataEntityList
                .stream()
                .map((dataEntity) -> {
                    return new Data(dataEntity.getName(), dataEntity.getEvents());
                })
                .toList();
        return dataList;
    }
}
