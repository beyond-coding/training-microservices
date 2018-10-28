package com.beyondcoding.teahouse.teahouse;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class OrderDispatcher {

    private final MessageChannel teas;

    private final MessageChannel desserts;

    public OrderDispatcher(MessageChannel teas, MessageChannel desserts) {
        this.teas = teas;
        this.desserts = desserts;
    }

    public void orderTea() {
        Order order = new Order("Tea Order");
        System.out.println("Dispatching: " + order.getProduct());
        Message<Order> message = MessageBuilder.withPayload(order)
                .build();
        teas.send(message);
    }

    public void orderDessert() {
        Order order = new Order("Dessert Order");
        System.out.println("Dispatching: " + order.getProduct());
        Message<Order> message = MessageBuilder.withPayload(order)
                .build();
        desserts.send(message);
    }

}
