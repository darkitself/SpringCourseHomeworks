package com.course.springhomeworks.adapter.repository;

import com.course.springhomeworks.domain.ToDoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoListEntity,Long> {
}
