package com.learn.consulconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * consule-config
 *
 * @Author: jerry
 * @date: 2019/8/26 14:57
 * @description:
 **/

@EnableConfigServer
@SpringBootApplication
public class ConsulConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigServerApplication.class,args);
    }
}
