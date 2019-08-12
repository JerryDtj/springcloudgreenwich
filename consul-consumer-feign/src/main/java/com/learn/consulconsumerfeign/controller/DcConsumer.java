package com.learn.consulconsumerfeign.controller;

import com.learn.consulconsumerfeign.service.DCService;
import com.learn.consulconsumerfeign.service.JerryService;
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
    private DCService dcService;

    @Autowired
    private JerryService jerryService;

    @GetMapping("/dc")
    public String dcConsumer(){
        String dc = dcService.getDC();
        String jerryDc = jerryService.getDc();
        return String.format("return:%s,%s",dc,jerryDc);
    }
}
