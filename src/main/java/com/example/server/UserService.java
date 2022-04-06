package com.example.server;

import com.example.pojo.User;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

//User服务接口
public interface UserService {
    /*添加User*/
    void addUser(User user);

    /*查找用户*/
    User findUser(User user);

    /*获取所有User数据*/
    List<User> findAll();

    /*删除User数据*/
    void deleteUser(Integer userId);
}
