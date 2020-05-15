package com.learn.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2020/5/11 14:30
 * @description:
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaPeer1 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPeer1.class,args);
    }
}
