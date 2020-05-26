package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Validate(4)";
	}
	
	@RequestMapping("/insertForm")
	public String insertForm () {
		
		return "createPage";
	}
	
	
	@RequestMapping("/create")
	public String insert2 (@ModelAttribute("dto") @Valid ContentDto dto, BindingResult result ) {
		// @Valid 를 통해 자동으로 검증 
		
		String page = "createDonePage";
		System.out.println(dto);
		
//		ContentValidator validator = new ContentValidator();
//		validator.validate(dto, result);
		if(result.hasErrors()) {
			
//			if(result.getFieldError("writer") != null) {
//				System.out.println("1:" + result.getFieldError("writer").getCode());
//			}
//			if(result.getFieldError("content") != null) {
//				System.out.println("2:" + result.getFieldError("content").getCode());
//			}
			if(result.getFieldError("writer") != null) {
				System.out.println("1:" + result.getFieldError("writer").getDefaultMessage());
			}
			if(result.getFieldError("content") != null) {
				System.out.println("2:" + result.getFieldError("content").getDefaultMessage());
			}
			
			
			page = "createPage";
		}
			
		return page;
	}
	

//	@InitBinder
//	protected void initBinder(WebDataBinder binder) {
//		binder.setValidator(new ContentValidator());
//	}
	
		
	
}
