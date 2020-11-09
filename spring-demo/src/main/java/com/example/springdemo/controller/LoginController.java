package com.example.springdemo.controller;

import com.example.springdemo.entity.User;
import com.example.springdemo.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
@CrossOrigin(value = "*",maxAge = 3600)
@ResponseBody
public class LoginController {
    @PostMapping(value = "api/login")
  public Result login(@RequestBody User requesUser){
      String username = requesUser.getUsername();
      username = HtmlUtils.htmlEscape(username);

      if (!Objects.equals("admin",username) || !Objects.equals("pass",requesUser.getPassword())){
          String message = "账号密码错误";
          System.out.println("test");
          return new Result(400);
      }else{
          return new Result(200);
      }
  }

}
