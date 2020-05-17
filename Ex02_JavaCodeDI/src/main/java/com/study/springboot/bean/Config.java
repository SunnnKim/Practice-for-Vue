package com.study.springboot.return bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 클래스를 스프링설정 파일로 가져온다는 의미
@Configuration
public class Config {

	// 메서드의 리턴 값을 빈 객체로 사용함을 의미 
	@Bean
	public Member member1() {
		// Setter Injection (Setter 메소드를 이용한 의존성주입)
		Member member1 = new Member();
		member1.setName("이름");
		member1.setNickname("닉네임");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}

	@Bean(name="hello")		// name 을 통해 빈의 이름을 정할 수 있고 쓰지않았으면 메소드명이 이름이 됨 
	public Member member2() {
		//Constructor injection (생성자를 이용한 의존성주입)
		return new Member("전우치", "도사", new PrinterA());
	}
	
	@Bean
	public PrinterA printA() {
		return new PrinterA();
	}
	@Bean
	public PrinterB printB() {
		return new PrinterB();
	}
		
	// Bean 객체 : Spring이 IoC방식으로 관리하는 객
	// BeanFactory : Spring의 IoC를 담당하는 핵심 컨테이너 
	// Application Context : 빈팩토리를 확장한 IoC 컨테이너
	
}