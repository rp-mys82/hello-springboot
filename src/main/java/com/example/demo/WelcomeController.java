package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String getWC() {
		return "Welcome to Dockerized Spring Boot Deployed in AWS EC2";
	}

}
