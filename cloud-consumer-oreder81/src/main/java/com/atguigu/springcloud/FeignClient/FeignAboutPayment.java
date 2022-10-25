package com.atguigu.springcloud.FeignClient;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVER")
public interface FeignAboutPayment {
    @GetMapping("/GetPayment/{id}")
    CommonResult<Payment> SelectPayment(@PathVariable(value = "id") int id);

    @PostMapping(value = "/CreatePayment")
    CommonResult<Integer> CreatePayment(@RequestBody Payment payment);
}
