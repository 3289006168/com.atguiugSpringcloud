package com.h.atguigu.server.imp;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import com.h.atguigu.mapper.PaymentMapper;
import com.h.atguigu.server.PaymentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServerImp implements PaymentServer {

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public Payment GetPaymentById(Integer id) {
        return paymentMapper.GetPaymentById(id);
    }

    @Override
    public List<Payment> GetPaymentByLimit(Integer Page, Integer limit) {
        return paymentMapper.GetPaymentByLimit(Page,limit);
    }
}
