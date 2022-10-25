package com.h.atguigu.controller;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import com.h.atguigu.server.Hystrix;
import com.h.atguigu.server.imp.PaymentServerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Value("${server.port}")
    String ServerName;
    @Autowired
    PaymentServerImp paymentServerImp;

    @Autowired
    Hystrix hystrix;

    @GetMapping("GetPaymentById/{id}")
    public CommonResult<Payment> GetPaymentById(@PathVariable Integer id) {
        return new CommonResult<Payment>(200,"好了",paymentServerImp.GetPaymentById(id));
    }
    @GetMapping("GetPaymentByLimit/{Page}/{limit}")
    public CommonResult<List<Payment>> GetPaymentByLimit(@PathVariable Integer Page, @PathVariable Integer limit) {
        return  new CommonResult<List<Payment>>(200,"好了",paymentServerImp.GetPaymentByLimit(Page,limit));
    }

    @GetMapping("HystrixTestTure/{id}")
    public String HystrixTestTure(@PathVariable Integer id) {
        return hystrix.paymentOk(id);
    }

    @GetMapping("HystrixTestFalse/{id}")
    public String  HystrixTestFalse(@PathVariable Integer id) throws InterruptedException {
        return hystrix.paymentFalse(id);
    }
}
