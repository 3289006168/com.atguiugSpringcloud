package com.atguigu.springcloud.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "ABOUT-OPENFEIGN")
public interface FeignAboutTest {
    @GetMapping("/test/TimeOut")
    String Test();
}
