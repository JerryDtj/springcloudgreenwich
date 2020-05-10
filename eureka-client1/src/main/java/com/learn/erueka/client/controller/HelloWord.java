package com.learn.erueka.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2020/5/10 5:28 下午
 */
@RestController
@RequestMapping("/application")
@Slf4j
public class HelloWord {

    @GetMapping("/name")
    public String getApplicationName(){
        log.info("client request coming");
        return "eureka-client1";
    }

}
