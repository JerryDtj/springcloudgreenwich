package com.learn.hystrix.controller;

import com.learn.hystrix.service.DcServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019/8/27 9:21 下午
 */
@RestController
public class DcConsume {
    @Autowired
    DcServiceImpl dcServiceImpl;

    @GetMapping("/dcConsume")
    @HystrixCommand(fallbackMethod="dcFallBack")
    public String dc(){
       return dcServiceImpl.dc();
    }

    public String dcFallBack(){
        return "Hystrix fall back";
    }



}
