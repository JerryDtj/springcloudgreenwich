package com.learn.consulribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jerry
 * @Date 2019-08-07 21:32
 */

@RestController
public class ConsumerApplication {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dc")
    public String consumer(){
        return restTemplate.getForObject("http://consul-client10013/dc",String.class);
    }



}
