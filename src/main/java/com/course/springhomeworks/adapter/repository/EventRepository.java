package com.course.springhomeworks.adapter.repository;

import com.course.springhomeworks.domain.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
