package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// component -> Bean 을 어노테이션을 통해서사용할 수 있도록 등록 
@Component
public class Member {

	@Value("홍길동")
	private String name;
	
	@Value("도사")
	private String nickname;
	
	@Autowired
	@Qualifier("printerA")
	private Printer printer;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", nickname=" + nickname + ", printer=" + printer + "]";
	}
	
	
	public void print() {
		System.out.println("Hello " + name + " : " + nickname );
	}
	
}
