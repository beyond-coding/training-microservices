package com.beyondcoding.teahouse.teahouse;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Binding {

    String TEAS = "teas";

    String DESSERTS = "desserts";

    String PRODUCTS = "products";

    @Output(TEAS)
    MessageChannel teas();

    @Output(DESSERTS)
    MessageChannel desserts();

    @Input(PRODUCTS)
    SubscribableChannel products();

}
