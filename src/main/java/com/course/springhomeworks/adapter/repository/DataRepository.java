package com.course.springhomeworks.adapter.repository;

import com.course.springhomeworks.domain.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
}
