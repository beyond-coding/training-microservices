package com.beyondcoding.teahouse.teaexpert;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Binding {

    String ORDERS = "orders";

    String PRODUCTS = "products";

    @Input(ORDERS)
    SubscribableChannel orders();

    @Output(PRODUCTS)
    MessageChannel products();

}
