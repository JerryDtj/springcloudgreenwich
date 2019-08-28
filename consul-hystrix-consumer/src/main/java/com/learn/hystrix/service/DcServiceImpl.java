package com.learn.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jerry
 * @Date 2019/8/27 9:27 下午
 */

@FeignClient("consul-client-Hystrix")
public interface DcServiceImpl {
    /**
     * dc 生产者
     * @return
     */
    @GetMapping("/dc")
    public String dc();
}
