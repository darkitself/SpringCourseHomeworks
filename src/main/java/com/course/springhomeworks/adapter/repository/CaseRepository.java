package com.course.springhomeworks.adapter.repository;

import com.course.springhomeworks.domain.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<CaseEntity, Long> {

}
