package com.example.mapper;

import com.example.pojo.Status;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StatusDao {
    /*获取所有Status*/
    public List<Status> findAll();
}
