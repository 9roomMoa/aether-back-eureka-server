package com.groommoa.aether_back_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AetherBackEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AetherBackEurekaServerApplication.class, args);
	}

}
