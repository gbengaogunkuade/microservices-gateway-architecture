package com.odutayo.companybdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class CompanyBDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyBDiscoveryServerApplication.class, args);
	}

}
