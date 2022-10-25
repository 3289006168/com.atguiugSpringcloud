package com.atguigu.springcloud.openfeignServer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "HYSTRIX-PAYMENT")
public interface HystrixTestServer {
    @GetMapping("HystrixTestTure/{id}")
     String HystrixTestTure(@PathVariable("id") Integer id);
    @GetMapping("HystrixTestFalse/{id}")
     String  HystrixTestFalse(@PathVariable("id") Integer id);
}
