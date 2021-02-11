package com.myorg.springdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerExampleApplication {

	@RequestMapping("/")
	public String welcome(){
		return "Welcome to Spring docker container !!";
	}
	public static void main(String[] args) {
		System.out.println("running Spring docker !!!1");
		SpringApplication.run(SpringDockerExampleApplication.class, args);
	}

}
