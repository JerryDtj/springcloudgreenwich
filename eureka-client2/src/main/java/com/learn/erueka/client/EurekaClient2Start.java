package com.learn.erueka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Jerry
 * @Date 2020/5/10 5:07 下午
 */
@EnableFeignClients
@SpringBootApplication
public class EurekaClient2Start {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Start.class,args);
    }
}
