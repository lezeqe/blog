package com.lou.springboot.louspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lou.springboot.louspringboot.dao") //添加 @Mapper 注解
public class LouSpringbootApplication {

	public static void main(String[] args) {
		System.out.println("启动 Spring Boot...");
		SpringApplication.run(LouSpringbootApplication.class, args);
	}

}
