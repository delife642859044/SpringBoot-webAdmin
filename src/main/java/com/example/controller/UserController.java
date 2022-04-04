package com.example.controller;

import com.example.pojo.Status;
import com.example.pojo.User;
import com.example.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//前端控制器
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/addUser")
    public String addUser(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        Status status = new Status();
        status.setId(0);
        user.setStatus(status);
        userService.addUser(user);

        return "index";
    }
}
