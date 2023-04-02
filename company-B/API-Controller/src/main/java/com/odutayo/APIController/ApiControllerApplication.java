package com.odutayo.APIController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;




@SpringBootApplication
@EnableFeignClients
public class ApiControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiControllerApplication.class, args);
	}

}




