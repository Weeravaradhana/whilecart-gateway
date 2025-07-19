package com.devstack.whilecart.whilecart_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WhilecartGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhilecartGatewayApplication.class, args);
	}

}
