package com.spotifake.UIservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service", url="localhost:8100")
public interface UIProxy {
    @GetMapping("/user-service/test")
    public String retrieveText();
}
