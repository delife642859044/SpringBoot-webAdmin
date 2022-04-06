package com.example.server;

import com.example.pojo.Status;

import java.util.List;

/*Status操作接口*/
public interface StatusService {
    /*获取所有Status接口*/
    public List<Status> findAll();
}
