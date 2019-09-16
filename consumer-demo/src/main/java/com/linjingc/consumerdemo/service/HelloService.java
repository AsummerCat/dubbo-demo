package com.linjingc.consumerdemo.service;

import com.linjingc.apidemo.service.SayService;
import com.linjingc.apidemo.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Reference
	private TestService testService;
	@Reference(group="hello",mock = "true",id="sayServiceImpl")
	private SayService sayService;
	@Reference(version = "1.0")
	private SayService sayService1;

	public String hello() {
		return testService.test();
	}

	public String sayHello() {
		 System.out.println( sayService.sayHello());
		 System.out.println( sayService1.sayHello());
		return sayService1.sayHello();
	}
}

