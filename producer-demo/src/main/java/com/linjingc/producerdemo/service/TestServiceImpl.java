package com.linjingc.producerdemo.service;

import com.linjingc.apidemo.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service(timeout = 3000)
public class TestServiceImpl implements TestService {
	@Override
	public String test() {
		System.out.println("******demoprovider被访问******");
		return "Hello World!";
	}
}
