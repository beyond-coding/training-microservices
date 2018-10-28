package com.beyondcoding.teahouse.dessertexpert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class DessertEndpoint {

    @Value("${name.expert}")
    private String expert;

    @Value("${name.dessert}")
    private String dessert;

    @Value("${name.teahouse}")
    private String teahouse;

    @GetMapping
    String getDessert() {
        return expert + " prepared you a " + dessert + " specialty of " + teahouse;
    }

}
