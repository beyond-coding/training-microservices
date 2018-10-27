package com.beyondcoding.basic.greetingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class GreetingEndpoint {

    @Value("${greeting}")
    private String greeting;

    @Value("${number}")
    private String number;

    @GetMapping
    String getGreeting() {
        return greeting + " from instance number " + number;
    }

}
