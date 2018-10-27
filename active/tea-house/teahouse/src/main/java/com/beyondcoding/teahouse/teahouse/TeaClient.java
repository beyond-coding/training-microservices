package com.beyondcoding.teahouse.teahouse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "tea-expert", fallback = TeaClientFallback.class)
public interface TeaClient {

    @GetMapping
    String getTea();

}
