package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.web.dto.DataIn;
import com.course.springhomeworks.service.common.Data;
import com.course.springhomeworks.service.common.Info;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DataService {

    public Data createData(DataIn dataIn){
        long id = new Random().nextLong(Long.MAX_VALUE);

        Info info = new Info();
        info.setId(id);
        info.setDate(dataIn.info().getDate());

        Data data = new Data();
        data.setPrice(dataIn.price());
        data.setInfo(info);
        return data;
    }
}
