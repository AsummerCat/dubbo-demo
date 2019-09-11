package com.linjingc.producerdemo.service;

import com.linjingc.apidemo.service.SayService;
import org.apache.dubbo.config.annotation.Service;

@Service(timeout = 3000)
public class Say1ServiceImpl implements SayService {
	@Override
	public String sayHello() {
		return "再见了我的朋友2";
	}
}
