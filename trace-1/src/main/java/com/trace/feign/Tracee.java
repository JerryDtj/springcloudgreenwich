package com.trace.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "trace-2",configuration = FeignConfig.class)
public interface Tracee {

    @GetMapping("/trace-2")
    String getString();
}
