package com.learn.consulribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jerry
 * @Date 2019-08-07 21:31
 */
@SpringBootApplication
public class ConsulConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class,args);
    }

    @Bean
    @LoadBalanced
   public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
