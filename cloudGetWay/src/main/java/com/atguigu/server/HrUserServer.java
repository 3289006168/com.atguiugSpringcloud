package com.atguigu.server;

import com.atguigu.Entity.UserInfo;

public interface HrUserServer {
    UserInfo getByName(String name);
}
