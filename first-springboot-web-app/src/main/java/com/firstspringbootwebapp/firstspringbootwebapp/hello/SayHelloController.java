package com.firstspringbootwebapp.firstspringbootwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@ResponseBody
	@GetMapping("/say-hello")
	public String sayHello() {
		return "hello, what are you learning today? ";
	}

	@GetMapping("/say-hello-html")
	public String sayHelloHtml() {
		return "sayHello";
	}

}
