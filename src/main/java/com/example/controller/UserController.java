package com.example.controller;

import com.example.pojo.Status;
import com.example.pojo.User;
import com.example.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;

//前端User相关控制器
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /*添加用户*/
    @PostMapping("/addUser")
    public String addUser(User user){

        userService.addUser(user);
        System.out.println(user.toString());

        return "redirect:/Management";
    }
    /*展示数据*/
    @GetMapping("/Management")
    public String findAll(Model model){
        Collection<User> userList = userService.findAll();
        System.out.println(userList.toString());
        model.addAttribute("UserList",userList);
        return "user/tables";
    }

    @GetMapping("/delete/{userId}")
    public String delete(@PathVariable("userId") Integer userId){
        System.out.println(userId);
        userService.deleteUser(userId);
        return "redirect:/Management";
    }
}
