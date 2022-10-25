package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVER/";

    @GetMapping("/consumer/CreatePayment")
    public CommonResult<Payment> CreatePayment(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "CreatePayment", payment, CommonResult.class);
    }

    @GetMapping("/consumer/GetPayment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PAYMENT_URL+"GetPayment/" + id, CommonResult.class);
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
