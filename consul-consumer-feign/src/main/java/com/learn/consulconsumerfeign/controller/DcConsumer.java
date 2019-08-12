package com.learn.consulconsumerfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-08-12 09:04
 */
@RestController
public class DcConsumer {
    @Autowired
    private DcConsumer dcConsumer;

    @GetMapping("/dc")
    public String dcConsumer(){
        return dcConsumer.dcConsumer();
    }
}
