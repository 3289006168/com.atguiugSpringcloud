package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MyHystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(MyHystrixDashboardMain9001.class,args);
    }
}
