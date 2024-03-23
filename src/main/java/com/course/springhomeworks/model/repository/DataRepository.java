package com.course.springhomeworks.model.repository;

import com.course.springhomeworks.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataModel, Long> {
}
