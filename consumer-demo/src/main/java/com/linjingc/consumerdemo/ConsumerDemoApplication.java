package com.linjingc.consumerdemo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerDemoApplication.class, args);
	}


}
