package com.example.blockchain;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.blockchain.ethereum.EthereumBean;

@Configuration
public class Config {

	@Bean
	EthereumBean ethereumBean() throws Exception {
		EthereumBean ethereumBean = new EthereumBean();
		Executors.newSingleThreadExecutor().submit(ethereumBean::start);
		return ethereumBean;
	}
}
