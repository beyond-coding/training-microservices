package com.beyondcoding.basic.communicationgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CommunicationGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicationGatewayApplication.class, args);
	}
}
