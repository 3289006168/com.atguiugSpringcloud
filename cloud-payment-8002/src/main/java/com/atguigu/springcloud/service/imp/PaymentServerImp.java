package com.atguigu.springcloud.service.imp;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.PaymentServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServerImp implements PaymentServer {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
