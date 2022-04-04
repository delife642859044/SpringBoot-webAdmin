package com.example.server.serverImp;

import com.example.mapper.UserDao;
import com.example.pojo.User;
import com.example.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//实现UserService
@Service
public class UserServiceImpl implements UserService {
    /*注入*/
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
