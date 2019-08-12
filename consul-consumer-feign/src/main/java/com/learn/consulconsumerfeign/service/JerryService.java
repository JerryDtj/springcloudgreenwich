package com.learn.consulconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/12 10:52
 * @description:
 **/
@FeignClient("consul-client-jerry")
public interface JerryService {
    @GetMapping("/dc")
    public String getDc();
}
