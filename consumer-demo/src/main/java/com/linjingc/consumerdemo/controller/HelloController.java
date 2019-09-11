package com.linjingc.consumerdemo.controller;

import com.linjingc.consumerdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping("/hello")
	public String hello() {
		return helloService.hello();
	}

	@RequestMapping("/sayHello")
	public String sayHello() {
		return helloService.sayHello();
	}


}
