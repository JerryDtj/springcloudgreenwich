package com.learn.consulconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jerry
 * @Date 2019-08-12 08:56
 */
@FeignClient("consul-client")
public interface DCService {

    @GetMapping("/dc")
    String getDC();
}
