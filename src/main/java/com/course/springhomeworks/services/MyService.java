package com.course.springhomeworks.services;

import com.course.springhomeworks.models.AfterFirst;
import com.course.springhomeworks.models.ForProfile;
import com.course.springhomeworks.models.WithParam;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class MyService {
    private ForProfile profileBean;
    private AfterFirst afterBean;
    private WithParam paramBean;

    public String getAppName() {
        return profileBean.getAppName();
    }

    public String getList() {
        return Arrays.toString(afterBean.getListProp());
    }

    public String getVar() {
        return paramBean.getVar();
    }
}
