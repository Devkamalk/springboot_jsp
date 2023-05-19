package com.kamal2.kamal2jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
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
			return "hi";
		}
		 

}
