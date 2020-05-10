package com.learn.eureka;

import com.sun.tools.javadoc.Start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Jerry
 * @Date 2020/5/1 7:12 上午
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class,args);
    }
}
