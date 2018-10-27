package com.beyondcoding.teahouse.teaexpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TeaExpertApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeaExpertApplication.class, args);
	}
}
