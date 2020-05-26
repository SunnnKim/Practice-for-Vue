package com.study.springboot;

import lombok.Data;

@Data		// Lombok을 사용하여 객체의 getter / setter 자동생성 
public class Member {

	// command 객체 : 파라미터와 관련됨 
	// DTO : 데이터베이스 테이블과 같은 이름으로 구성된 객체 
	
	private String id;
	private String name;
	
}
