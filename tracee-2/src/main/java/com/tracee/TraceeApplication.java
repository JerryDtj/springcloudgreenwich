package com.tracee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class TraceeApplication {

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace(HttpServletRequest request) {
        System.out.println(request.getHeader("X-B3-TraceId"));
        return "Trace";
    }

    @RequestMapping(value = "/tracee", method = RequestMethod.GET)
    public String tracee() {
        return "Tracee";
    }

    public static void main(String[] args) {
        SpringApplication.run(TraceeApplication.class, args);
    }
}
