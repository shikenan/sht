package com.bjsxt.portaltest.feign;


import com.bjsxt.portaltest.pojo.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("orders-eureka")
public interface OrderProvider {

    @PostMapping("/orders")
    public String saveOrders(@RequestBody Orders orders);

}
