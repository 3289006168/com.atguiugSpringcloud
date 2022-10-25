package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Payment;

public interface PaymentServer {
    int createPayment(Payment payment);
    Payment getPaymentById(Integer id);
}
