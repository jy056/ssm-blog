package com.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication	//是复合注解
//@RestController
@Controller
@MapperScan("com.yc")
public class DemoBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBlogApplication.class, args);
	}
	
	@GetMapping("hello") 
	public String hello(){
		return "hello";
	}
}
