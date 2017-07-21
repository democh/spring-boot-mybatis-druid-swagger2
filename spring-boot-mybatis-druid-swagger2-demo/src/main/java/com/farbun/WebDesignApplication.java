package com.farbun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan(basePackages = {"com.farbun.basic.*.dao"})
public class WebDesignApplication {

	@RequestMapping("/")
	public String init(){
		return "hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebDesignApplication.class, args);
	}
}
