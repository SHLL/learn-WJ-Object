package com.example.springdemo.controller;

import com.example.springdemo.entity.Persons;
import com.example.springdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//跨域解决
@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PersonHandler {

    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @GetMapping("persons/findAll")
    public List<Persons> findAll(){
        return personRepository.findAll();
    }
}
