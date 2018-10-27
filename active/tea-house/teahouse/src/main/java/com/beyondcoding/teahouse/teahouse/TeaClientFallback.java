package com.beyondcoding.teahouse.teahouse;

import org.springframework.stereotype.Component;

@Component
public class TeaClientFallback implements TeaClient {

    @Override
    public String getTea() {
        return "Our best experts prepared a Fallback tea for you";
    }
}
