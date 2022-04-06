package com.example.server.serverImp;

import com.example.mapper.UserDao;
import com.example.pojo.User;
import com.example.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//实现UserService
@Service
public class UserServiceImpl implements UserService {
    /*注入*/
    @Autowired
    private UserDao userDao;

    /*添加User用户*/
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /*判断User用户是否匹配*/
    @Override
    public User findUser(User user) {
        User findUser = userDao.findUser(user);

        return findUser;
    }
    /*获取所有User实现*/
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }
}
