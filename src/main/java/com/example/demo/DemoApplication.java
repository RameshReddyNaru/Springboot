package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("hello")
	public String sayHello(){
		return "hello World";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
