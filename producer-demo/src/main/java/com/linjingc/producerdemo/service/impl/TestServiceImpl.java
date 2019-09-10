package com.linjingc.producerdemo.service.impl;

import com.linjingc.producerdemo.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service(validation = "1.0.0",timeout = 3000)
public class TestServiceImpl implements TestService {
	@Override
	public String test() {
		System.out.println("******demoprovider被访问******");
		return "Hello World!";
	}
}
