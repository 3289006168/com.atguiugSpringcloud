package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int createPayment(Payment payment);
    Payment getPaymentById(@Param("id") Integer id);
}
