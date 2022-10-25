package com.atguigu.FeignServer;

import com.atguigu.FeignServer.back.PaymentBackImp;
import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVER",fallback = PaymentBackImp.class)
public interface PaymentOpenFeign {
        @GetMapping("/GetPayment/{id}")
        CommonResult<Payment> SelectPayment(@PathVariable(value = "id") int id);

        @PostMapping(value = "/CreatePayment")
        CommonResult<Integer> CreatePayment(@RequestBody Payment payment);
}

