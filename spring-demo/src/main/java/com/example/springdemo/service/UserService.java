package com.example.springdemo.service;


import com.example.springdemo.entity.User;
import com.example.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean isExist(String username){
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userRepository.findByUsername(username);
    }

    public User get(String username, String password){
        return userRepository.getByUsernameAndPassword(username, password);
    }

    public void add(User user){
        userRepository.save(user);
    }

}
