package com.nissan.automobile.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AutoMobileSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoMobileSystemApplication.class, args);
	}

}
