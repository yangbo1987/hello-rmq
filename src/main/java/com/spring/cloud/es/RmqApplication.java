package com.spring.cloud.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RmqApplication {
	public static void main(String[] args) {
		SpringApplication.run(RmqApplication.class, args);
		System.out.println("RMQ服务启动成功...");
	}
}
