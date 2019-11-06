package com.bjsxt.portaltest.feign;


import com.bjsxt.portaltest.pojo.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("store-eureka")
public interface StoreProvider {


    @PostMapping("/store")
    public Integer updateStore(@RequestBody Store store);


}
