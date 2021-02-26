package com.example.springdemo.controller;

import com.example.springdemo.entity.Gs;
import com.example.springdemo.repository.GsTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@CrossOrigin(value = "*",maxAge = 3600)
@RestController
@RequestMapping("/gs")
public class GsTestController {


    private GsTestRepository gsTestRepository;

    @Autowired
    public void setGsTestRepository(GsTestRepository gsTestRepository) {
        this.gsTestRepository = gsTestRepository;
    }

    @GetMapping("/findAll")
    public List<Gs> findAll(){
        return gsTestRepository.findAll();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Gs> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        PageRequest pageable = PageRequest.of(page,size);
        return gsTestRepository.findAll(pageable);
    }
}
