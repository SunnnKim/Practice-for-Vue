package com.study.springboot;

public class Member {

	// command 객체 : 파라미터와 관련됨 
	// DTO : 데이터베이스 테이블과 같은 이름으로 구성된 객체 
	private String id;
	private String name;
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
