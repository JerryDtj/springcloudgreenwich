package com.learn.consulconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Jerry
 * @Date 2019/8/26 9:07 下午
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigServerApplication.class,args);
    }
}
