package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.FeignClient.FeignAboutTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeignTimeOutTest {
    @Autowired
    FeignAboutTest feignAboutTest;
    @GetMapping("/test1")
    public String test(){
       return feignAboutTest.Test();
    }
}
