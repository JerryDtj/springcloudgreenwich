package com.learn.erueka.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2020/5/15 22:42
 * @description:
 **/
@FeignClient("eureka-client1")
@RequestMapping("helloWord")
public interface HelloWordFeign {
    @PostMapping("/getAppName")
    public String getAppName();
}
