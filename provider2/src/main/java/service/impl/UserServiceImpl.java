package service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {
	@Override
	public String userTest(String name) {
		return "hello, " + name + " you are using userTest method......";
	}
}
