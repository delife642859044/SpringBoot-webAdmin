package com.example.controller;


import com.example.pojo.User;
import com.example.server.UserService;
import org.apache.ibatis.javassist.compiler.MemberResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

//前端Web相关控制器
@Controller
public class WebController {
    @Autowired
    private UserService userService;

    /*登录*/
    @PostMapping("/userLogin")
    public String login(String username, String password, HttpSession session, Model model){
        System.out.println(username + password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);


        User userLogin = userService.findUser(user);
        if (userLogin != null){
            session.setAttribute("loginUser",username);
            model.addAttribute("myUser",userLogin);
            return "index";
        }else{
            model.addAttribute("msg", "登录失败,请检查用户名或密码!");
            return "login";
        }

    }

    /*注销用户*/
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("User");
        return "login";
    }
}
