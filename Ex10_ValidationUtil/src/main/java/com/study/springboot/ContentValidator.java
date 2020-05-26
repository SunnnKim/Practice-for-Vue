package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// 검증할 객체의클래스 타입정보 
		return ContentDto.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ContentDto dto = (ContentDto) obj;
		
		String sWriter = dto.getWriter();
		String sContent = dto.getContent();
		
		
		// ValidationUtils를 사용한 경우 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "writer is null");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "content is null");
		
		
		// writer를 입력안할 경우
//		if(sWriter == null || sWriter.trim().isEmpty()) {
//			System.out.println("writer is Null or Empty");
//			errors.rejectValue("writer", "trouble");	// 비었을 경우 에러만들기 
//		}
		
		// content를 입력안할 경우
//		if(sContent == null || sContent.trim().isEmpty()) {
//			System.out.println("Content is Null or Empty");
//			errors.rejectValue("content", "trouble");	// 비었을 경우 에러 만들기 
//		}
		
	}

}
