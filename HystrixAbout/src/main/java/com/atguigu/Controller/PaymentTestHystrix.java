package com.atguigu.Controller;

import com.atguigu.FeignServer.PaymentOpenFeign;
import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class PaymentTestHystrix {
    @Autowired
    PaymentOpenFeign paymentOpenFeign;
    @GetMapping("/AboutHystrixTest")
    public CommonResult<Integer> Test(Payment payment){
        return paymentOpenFeign.CreatePayment(payment);
    }
    @GetMapping("/AboutHystrixTest/{id}")
    public CommonResult<Payment> Test2(@PathVariable Integer id){
        return paymentOpenFeign.SelectPayment(id);
    }
    @GetMapping("/AboutHystrixTest3")
    @HystrixCommand(fallbackMethod = "Test5",
    commandProperties = {
     @HystrixProperty(
             name="execution.isolation.thread.timeoutMilliseconds",
             value = "5000")
    })
    public String Test3() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        return "我的线程池是"+Thread.currentThread().getName();
    }
    public String Test5(){
        return "这是一个关于Hystrix的测试";
    }
}
