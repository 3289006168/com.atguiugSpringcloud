package com.h.atguigu.mapper;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentMapper {
    Payment GetPaymentById(@Param("id") Integer id);

    List<Payment> GetPaymentByLimit(@Param("Page") Integer Page , @Param("limit") Integer limit);
}
