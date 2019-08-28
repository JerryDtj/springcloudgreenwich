package com.learn.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Jerry
 * @Date 2019/8/28 8:48 下午
 */
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class ConsulHystrixDashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulHystrixDashBoardApplication.class,args);
    }
}
