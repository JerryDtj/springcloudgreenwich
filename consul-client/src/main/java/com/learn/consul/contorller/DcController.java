package com.learn.consul.contorller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-08-07 07:46
 */
@RestController
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${config.username}")
    private String userName;

    @GetMapping("/dc")
    public String dc(){
        return "client";
    }

    @GetMapping("/userName")
    public String getUserName(){
        return userName+"***";
    }
}
