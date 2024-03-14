package com.course.springhomeworks.services;

import com.course.springhomeworks.models.Data;
import com.course.springhomeworks.models.dto.DataDTO;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class JsonService {
    private final ConcurrentHashMap<Integer, Data> dataCollections = new ConcurrentHashMap<>();
    public Data updateData(DataDTO data) {
        int id = dataCollections.size();

        Data newData = new Data();
        newData.setPrice(data.getPrice());
        newData.setInfo(new Data.Info(id, data.getInfo().getDate()));

        dataCollections.put(id, newData);
        return newData;
    }

    public Collection<Data> getDataCollection() {
        return dataCollections.values();
    }
}
