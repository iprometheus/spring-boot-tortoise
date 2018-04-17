package com.fangxing.uac.client;

import com.fangxing.uac.starter.AutoConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FangxingUacClientApplication implements CommandLineRunner {


	@Resource
	AutoConfiguration autoConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(FangxingUacClientApplication.class, args);
	}


	public void run(String...strings){
		System.out.println(autoConfiguration.init());
	}
}
