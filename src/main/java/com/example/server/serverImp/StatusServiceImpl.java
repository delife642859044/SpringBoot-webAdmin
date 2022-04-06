package com.example.server.serverImp;

import com.example.mapper.StatusDao;
import com.example.pojo.Status;
import com.example.server.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusDao statusDao;
    @Override
    public List<Status> findAll() {
        return statusDao.findAll();
    }
}
