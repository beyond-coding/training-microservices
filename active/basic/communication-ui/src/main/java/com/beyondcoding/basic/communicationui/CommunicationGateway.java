package com.beyondcoding.basic.communicationui;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "communication-gateway", fallback = CommunicationGatewayFallback.class)
public interface CommunicationGateway {

    @RequestMapping("/greeting")
    String getGreeting();

    @RequestMapping("/message")
    String getMessage();

}
