package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 자동으로 어플리케이션 설정을 만들어줌 
// @SpringBootApplication
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1. IoC Container 생성 s
		ApplicationContext context  = new AnnotationConfigApplicationContext();
		
	}

}
