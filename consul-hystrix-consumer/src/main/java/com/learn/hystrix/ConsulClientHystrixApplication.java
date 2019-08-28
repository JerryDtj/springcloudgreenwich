package com.learn.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Jerry
 * @Date 2019/8/27 9:18 下午
 */
@SpringCloudApplication
@EnableFeignClients
@EnableHystrixDashboard
public class ConsulClientHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientHystrixApplication.class,args);
    }
}
