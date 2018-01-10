package com.example.blockchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LearnEthereumApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnEthereumApplication.class, args);
	}
}
