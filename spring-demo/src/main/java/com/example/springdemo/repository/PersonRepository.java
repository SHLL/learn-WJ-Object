package com.example.springdemo.repository;

import com.example.springdemo.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Persons,Integer> {

}
