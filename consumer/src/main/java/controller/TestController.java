package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TestService;
import service.UserService;

@Controller
@RequestMapping("/dubbo")
public class TestController {
	@Autowired
	private TestService testService;
	@Autowired
	private UserService userService;
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		String steve = testService.test("steve");
		return steve + " you are using dubbo......";
	}
	@RequestMapping("/user")
	@ResponseBody
	public String userTest(){
		return userService.userTest("steve");
	}
}
