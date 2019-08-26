package com.learn.consul;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Jerry
 * @Date 2019-08-07 07:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientApplication.class,args);
    }
}
