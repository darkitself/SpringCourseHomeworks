package com.course.springhomeworks.domain;

import com.course.springhomeworks.domain.common.BaseDomainEntity;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.util.List;

@Getter
@Entity
@Table(name = "DATA")
@NoArgsConstructor
@AllArgsConstructor
public class DataEntity extends BaseDomainEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Type(JsonType.class)
    @Column(name = "EVENTS", nullable = false)
    private List<String> events;
}
