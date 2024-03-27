package com.course.springhomeworks.repositories;

import com.course.springhomeworks.db.entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {}
