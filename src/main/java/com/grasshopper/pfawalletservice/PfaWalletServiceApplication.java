package com.grasshopper.pfawalletservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PfaWalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfaWalletServiceApplication.class, args);
	}

}
