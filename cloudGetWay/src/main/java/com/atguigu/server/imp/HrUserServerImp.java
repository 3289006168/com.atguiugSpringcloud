package com.atguigu.server.imp;

import com.atguigu.Entity.UserInfo;
import com.atguigu.Mapper.HrUserMapper;
import com.atguigu.server.HrUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrUserServerImp implements HrUserServer {
    @Autowired
    HrUserMapper hrUserMapper;
    @Override
    public UserInfo getByName(String name) {
        return hrUserMapper.getByName(name);
    }
}
