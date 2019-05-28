package com.karohani.study.spring.batch.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class User {
    private Long id;
    private String name;
}
