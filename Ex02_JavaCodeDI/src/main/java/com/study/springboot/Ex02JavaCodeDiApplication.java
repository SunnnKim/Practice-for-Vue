package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;

// 자동으로 어플리케이션 설정을 만들어줌 
// @SpringBootApplication
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1. IoC Container 생성 s
		ApplicationContext context  = new AnnotationConfigApplicationContext(Config.class);
		
		
		// 2. member 가져오기
		Member member1 = (Member)context.getBean("member1");
		member1.print();
		
		//3. Member Bean 가져오기
		Member member2 = context.getBean("hello", Member.class);
		member2.print();
		
		// 4. Print Bean 가져오기 
		Printer printer = context.getBean("printB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
	}

}
