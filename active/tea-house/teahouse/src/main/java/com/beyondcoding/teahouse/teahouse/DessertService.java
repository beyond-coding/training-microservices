package com.beyondcoding.teahouse.teahouse;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DessertService {

    private final RestTemplate restTemplate;

    public DessertService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "fallbackDessert")
    public String getDessert() {
        return restTemplate.getForObject("http://dessert-expert", String.class);
    }

    private String fallbackDessert() {
        return "Our best experts prepared a Fallback cake for you";
    }
}
