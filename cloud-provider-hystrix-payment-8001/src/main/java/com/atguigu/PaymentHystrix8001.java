package com.atguigu;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
//@EnableHystrixDashboard
//@DefaultProperties(defaultFallback = "HystrixHint")
public class PaymentHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix8001.class,args);
    }

    public  String HystrixHint(){
        return "网络发了小差";
    }
}
