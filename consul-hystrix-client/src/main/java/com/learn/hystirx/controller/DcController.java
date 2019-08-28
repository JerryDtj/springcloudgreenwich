package com.learn.hystirx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019/8/27 10:01 下午
 */
@RestController
public class DcController {
    @GetMapping("/dc")
    public String dc(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hystrix client dc";
    }
}
