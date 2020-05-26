package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContentDto {

	// 어노테이션으로 Validation Check하기
	
	private int id;
	
	@NotNull( message="Writer is null.")	// null 허용금지 
	@NotEmpty(message="Writer is empty")	// 빈 문자열 금지 
	@Size(min=3, max=10, message="Writer min is 3, max is 10")// 사이즈(length)는 3~10자 
	private String writer;
	
	@NotNull( message="Content is null.")	// null 허용금지 
	@NotEmpty(message="Content is empty")	// 빈 문자열 금지 
	@Size(min=3, message="Content min is 3")// 사이즈(length)는 3자 이상  
	private String content;
	
}
