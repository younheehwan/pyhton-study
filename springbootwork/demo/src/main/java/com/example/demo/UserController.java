package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	// http://localhost:8080/
	@GetMapping("/")
	public String test1() {
		return "ok";
	}
	
	@GetMapping("/user")
	public User test2() {
		User user = new User();
		user.setId(1);
		user.setUsername("ssar");
		user.setPassword("1234");
		return user;
	}
}
