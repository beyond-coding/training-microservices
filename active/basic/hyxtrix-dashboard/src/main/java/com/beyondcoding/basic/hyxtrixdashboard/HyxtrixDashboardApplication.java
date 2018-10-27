package com.beyondcoding.basic.hyxtrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class HyxtrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxtrixDashboardApplication.class, args);
	}
}
