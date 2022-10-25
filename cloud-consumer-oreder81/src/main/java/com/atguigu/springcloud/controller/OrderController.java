package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.FeignClient.FeignAboutPayment;
import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    FeignAboutPayment feignAboutPayment;
    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping("/consumer/CreatePayment")
    public CommonResult<Integer> CreatePayment(Payment payment) {
       return feignAboutPayment.CreatePayment(payment);
    }

    @GetMapping("/consumer/GetPayment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id) {
       return feignAboutPayment.SelectPayment(id);
    }
    @GetMapping("/test")
    public HashMap<Object,Object> Test(){
        List<String> services = discoveryClient.getServices();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVER");
        for (ServiceInstance instance : instances) {
            objectObjectHashMap.put(instance.getInstanceId(),instance.getInstanceId());
            objectObjectHashMap.put(instance.getHost(),instance.getHost());
            objectObjectHashMap.put(instance.getPort(),instance.getPort());
            objectObjectHashMap.put(instance.getUri(),instance.getUri());
            objectObjectHashMap.put(instance.getMetadata(),instance.getMetadata());
            objectObjectHashMap.put("services",services);
        }
        return  objectObjectHashMap;
    }
}
