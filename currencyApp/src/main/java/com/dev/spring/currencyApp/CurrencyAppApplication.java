package com.dev.spring.currencyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class CurrencyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyAppApplication.class, args);
	}

}
