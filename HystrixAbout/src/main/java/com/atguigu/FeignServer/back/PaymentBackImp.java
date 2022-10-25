package com.atguigu.FeignServer.back;

import com.atguigu.FeignServer.PaymentOpenFeign;
import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentBackImp implements PaymentOpenFeign {
    @Override
    public CommonResult<Payment> SelectPayment(int id) {
        return new CommonResult<>(400,"查询失败");
    }

    @Override
    public CommonResult<Integer> CreatePayment(Payment payment) {
        return new CommonResult<>(400,"创建失败");
    }

}
