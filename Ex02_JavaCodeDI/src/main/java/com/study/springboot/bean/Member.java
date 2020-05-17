package com.study.springboot.bean;

public class Member {

	private String name;
	private String nickname;
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
