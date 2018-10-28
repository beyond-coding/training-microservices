package com.beyondcoding.teahouse.teaexpert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class OrdersProcessor {

    @Value("${name.tea}")
    private String tea;

    @Value("${name.expert}")
    private String expert;

    @Value("${name.teahouse}")
    private String teahouse;

    @StreamListener(Binding.ORDERS)
    @SendTo(Binding.PRODUCTS)
    Product process(Order order) {
        System.out.println("Received: " + order);
        Product product = new Product(tea, expert, teahouse);
        waitSeconds(3);
        System.out.println("Sent: " + product);
        return product;
    }

    private void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
