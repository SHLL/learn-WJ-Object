package com.example.springdemo.dao;

import com.example.springdemo.pojo.Book;
import com.example.springdemo.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleOrAuthorLike(String keyword1 ,String keyword2);
}
