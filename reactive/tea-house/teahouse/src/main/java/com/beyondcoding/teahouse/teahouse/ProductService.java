package com.beyondcoding.teahouse.teahouse;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private String message = "No orders so far";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @StreamListener(Binding.PRODUCTS)
    void process(Product product) {
        System.out.println("Product received: " + product);
        message = product.getExpert() + " prepared a delicious " + product.getName() + " specialty of " + product.getTeahouse();
    }
}
