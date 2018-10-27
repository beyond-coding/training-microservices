package com.beyondcoding.basic.messageservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class MessageEndpoint {

    @Value("${message}")
    private String message;

    @GetMapping
    String getMessage() {
        return message;
    }

}
