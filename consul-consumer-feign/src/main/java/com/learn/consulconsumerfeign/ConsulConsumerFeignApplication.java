package com.learn.consulconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * despaction
 *
 * @Author: jerry
 * @date: 2019/8/8 18:01
 * @description:
 **/
@SpringCloudApplication
public class ConsulConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerFeignApplication.class,args);
    }
}
