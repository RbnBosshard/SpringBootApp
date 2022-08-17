package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	// test comment
	@RequestMapping("home")
	public String welcome() {
		return "Welcome to Spring World.";
	}
}
