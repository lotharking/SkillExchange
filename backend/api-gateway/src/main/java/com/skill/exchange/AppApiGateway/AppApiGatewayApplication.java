package com.skill.exchange.AppApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApiGatewayApplication.class, args);
	}

}
