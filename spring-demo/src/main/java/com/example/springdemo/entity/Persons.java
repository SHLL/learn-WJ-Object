package com.example.springdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Persons {
    @Id
    private Integer id;
    private String username;
    private String phone;
    private String sex;
}
