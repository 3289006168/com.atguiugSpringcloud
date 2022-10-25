package com.atguigu.server;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
//@HystrixCommand(defaultFallback = "payment_error")
public class Hystrix {
    public String paymentOk(Integer id) {
        return "线程是" + Thread.currentThread().getName() + id;
    }

    @HystrixCommand(fallbackMethod = "payment_error",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
            })
    public String paymentFalse(Integer id) throws InterruptedException {
        int TimeNumber = 5;
        TimeUnit.SECONDS.sleep(5);
        return "线程是" + Thread.currentThread().getName() + "id" + id + "线程出问题了" + "耗时" + TimeNumber;
    }

    public String payment_error(Integer id) {
        return "0(----)0" + id;
    }

    @HystrixCommand(fallbackMethod = "deptCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds",value = "1000"),
            @HystrixProperty(name ="circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name ="circuitBreaker.sleepWindowInMilliseconds",value = "1000"),
            @HystrixProperty(name ="circuitBreaker.errorThresholdPercentage",value = "60")
    }
    )
    public String deptCircuitBreaker(Integer id) {
        if (id < 0) {
            //当传入的 id 为负数时，抛出异常，调用降级方法
            throw new RuntimeException("c语言中文网提醒您，id 不能是负数！");
        }
        String serialNum = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号为：" + serialNum;
    }

    public String deptCircuitBreaker_fallback(Integer id) {
        return "c语言中文网提醒您，id 不能是负数,请稍后重试!\t id:" + id;
    }

}