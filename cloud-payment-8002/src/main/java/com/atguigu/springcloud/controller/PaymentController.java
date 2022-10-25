package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.imp.PaymentServerImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    PaymentServerImp paymentServerImp;
    @Value("${server.port}")
    private String ServerPort;
//    private String UrlName = "Payment";
    @PostMapping(value = "/CreatePayment")
    public CommonResult<Integer> CreatePayment(@RequestBody Payment payment){
        int count = paymentServerImp.createPayment(payment);
        if (count>0){
            return new CommonResult<Integer>(200,"创建成功"+ServerPort,count);
        }
       else return new CommonResult<Integer>(404,"创建失败");
    }
    @GetMapping("/GetPayment/{id}")
    public CommonResult<Payment> SelectPayment(@PathVariable("id") Integer id){
        Payment paymentById = paymentServerImp.getPaymentById(id);
        System.out.println(paymentById);
        if (paymentById!=null){
//            int a = 100;
            return new CommonResult<Payment>(200,"查询成功"+ServerPort,paymentById);
        }
        else return new CommonResult<Payment>(404,"查无此人");
    }
}
