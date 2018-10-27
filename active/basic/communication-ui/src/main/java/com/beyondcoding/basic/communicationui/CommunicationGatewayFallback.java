package com.beyondcoding.basic.communicationui;

import org.springframework.stereotype.Component;

@Component
public class CommunicationGatewayFallback implements CommunicationGateway {

    @Override
    public String getGreeting() {
        return "Greeting from Communication Gateway Fallback";
    }

    @Override
    public String getMessage() {
        return "Message from Communication Gateway Fallback";
    }
}
