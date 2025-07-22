package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("hello")
	public String sayHello(){
		int a=10;
		if(a>10)
		return "age is greater than 10";
		else
			return "age is lesser than 10";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
