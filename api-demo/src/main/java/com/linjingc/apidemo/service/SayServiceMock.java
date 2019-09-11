package com.linjingc.apidemo.service;

public class SayServiceMock implements SayService {
	public SayServiceMock() {
	}

	@Override
	public String sayHello() {
		return "请求失败";
	}
}
