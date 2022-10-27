package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class test {
    @GetMapping("/test/TimeOut")
    public String Test() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("test-1");
        System.out.println("test");
        System.out.println("test2-commit*****************---");
        System.out.println("test3-commit");
        return "test";
    }
}
