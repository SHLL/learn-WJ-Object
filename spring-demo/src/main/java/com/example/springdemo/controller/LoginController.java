package com.example.springdemo.controller;

import com.example.springdemo.entity.User;
import com.example.springdemo.result.Result;
import com.example.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
@CrossOrigin(value = "*",maxAge = 3600)
@ResponseBody
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "api/login")
  public Result login(@RequestBody User requesUser){
      String username = requesUser.getUsername();
      username = HtmlUtils.htmlEscape(username);

      User user = userService.get(username,requesUser.getPassword());
      if (null == user){
          return new Result(400);
      }else{
          return new Result(200);
      }
  }

}
