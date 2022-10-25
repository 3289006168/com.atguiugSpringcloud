package com.atguigu.Controller;

import com.atguigu.Entity.UserInfo;
import com.atguigu.server.imp.HrUserServerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    HrUserServerImp hrUserServerImp;
    @RequestMapping("test")
    public UserInfo TestForm(){
       return hrUserServerImp.getByName("admin");
    }
}
