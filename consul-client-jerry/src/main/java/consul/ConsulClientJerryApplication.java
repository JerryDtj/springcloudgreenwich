package consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jerry
 * @Date 2019-08-07 07:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientJerryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientJerryApplication.class,args);
    }
}
