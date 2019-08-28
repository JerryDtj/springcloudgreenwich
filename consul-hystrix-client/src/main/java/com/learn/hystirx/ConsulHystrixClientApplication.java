package com.learn.hystirx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jerry
 * @Date 2019/8/27 10:00 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulHystrixClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulHystrixClientApplication.class,args);
    }
}
