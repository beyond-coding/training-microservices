package com.beyondcoding.teahouse.dessertexpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReactiveDessertExpertApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDessertExpertApplication.class, args);
	}
}
