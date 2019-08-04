package service.impl;

import service.TestService;

public class TestServiceImpl implements TestService {
	public String test(String name) {
		return "hello, " + name;
	}
}
