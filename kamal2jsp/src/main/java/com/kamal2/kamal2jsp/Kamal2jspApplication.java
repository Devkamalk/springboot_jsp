package com.kamal2.kamal2jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = { "dao", "com.kamal2.kamal2jsp.controller", "dto" })
@EntityScan( basePackages = {"model"} )
@Controller // used to return view
public class Kamal2jspApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Kamal2jspApplication.class, args);
	}

	@GetMapping("/kk")
	String jspView() {
		return "first4";
	}

	@GetMapping("/")
	String hi() {
		System.out.println("Hiiiiiiiii");
		return "Demo";
	}
	
	@GetMapping("/homePage")
	String getHomePage() {
		return "home";
	}

}
