package com.linjingc.producerdemo.service;

import com.linjingc.apidemo.service.SayService;
import org.apache.dubbo.config.annotation.Service;

@Service(timeout = 3000, group = "hello")
public class SayServiceImpl implements SayService {
	@Override
	public String sayHello() {
		return "再见了我的朋友1";
	}
}
