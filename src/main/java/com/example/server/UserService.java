package com.example.server;

import com.example.pojo.User;

//User服务接口
public interface UserService {
    /*添加User*/
    void addUser(User user);

    /*查找用户*/
    User findUser(User user);
}
