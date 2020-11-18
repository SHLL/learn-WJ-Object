package com.example.springdemo.repository;

import com.example.springdemo.entity.Gs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GsTestRepository extends JpaRepository<Gs,Integer> {
    
}
