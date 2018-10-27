package com.beyondcoding.teahouse.teaexpert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class TeaEndpoint {

    @Value("${name.expert}")
    private String expert;

    @Value("${name.tea}")
    private String tea;

    @Value("${name.teahouse}")
    private String teahouse;

    @GetMapping
    String getTea() {
        return expert + " prepared you a " + tea + " specialty of " + teahouse;
    }

}
