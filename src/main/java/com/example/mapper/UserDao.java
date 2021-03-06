package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//mybatis接口映射
@Mapper
@Repository
public interface UserDao {
//    获取所有数据
    public List<User> findAll();

    /*添加User*/
    public void addUser(User user);

    /*查找User*/
    public User findUser(User user);

    /*删除User*/
    public void deleteUser(Integer userid);
}
