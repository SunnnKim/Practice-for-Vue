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
		return "Validate(3)";
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
		if(result.hasErrors()) page = "createPage";
		
		return page;
	}
	

	// annotation으로 디펜던시를 추가하고 검증이 필요한 곳마다 Validator를 생성하지 않고 어노테이션으로 가져오도록 한다.
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new ContentValidator());
	}
	
		
	
}
