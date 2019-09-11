package com.consule.consulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulGatewayApplication.class, args);
    }

}
