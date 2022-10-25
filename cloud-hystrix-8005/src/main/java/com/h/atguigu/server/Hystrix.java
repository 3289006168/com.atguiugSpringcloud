package com.h.atguigu.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class Hystrix {
    public String paymentOk(Integer id){
        return "线程是" + Thread.currentThread().getName()+id;
    }
    @HystrixCommand(fallbackMethod = "payment_error",
    commandProperties = {
       @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentFalse(Integer id) throws InterruptedException {
        int TimeNumber=5;
        TimeUnit.SECONDS.sleep(5);
        return "线程是" + Thread.currentThread().getName()+"id"+id+"线程出问题了"+"耗时"+TimeNumber;
    }

    public String payment_error(Integer id){
        return "0(----)0"+id;
    }
}
