package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringNew1Application {
	
	@RequestMapping("/")
	public String name() {
		return "helloworld";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringNew1Application.class, args);
	}

}
