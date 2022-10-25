package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.openfeignServer.HystrixTestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HystrixController {
    @Autowired
    HystrixTestServer hystrixTestServer;
    @GetMapping("HystrixTestTure/{id}")
    public String HystrixTestTure(@PathVariable("id") Integer id) {
        return hystrixTestServer.HystrixTestTure(id);
    }

    @GetMapping("HystrixTestFalse/{id}")
    public String  HystrixTestFalse(@PathVariable("id") Integer id){
        return hystrixTestServer.HystrixTestFalse(id);
    }
}
