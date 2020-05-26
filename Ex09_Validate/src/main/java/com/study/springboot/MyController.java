package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Validate(1)";
	}
	
	@RequestMapping("/insertForm")
	public String insertForm () {
		
		return "createPage";
	}
	
	
	@RequestMapping("/create")
	public String insert2 (@ModelAttribute("dto") ContentDto dto, BindingResult result ) {
		
		String page = "createDonePage";
		System.out.println(dto);
		
		ContentValidator validator = new ContentValidator();
		validator.validate(dto, result);
		if(result.hasErrors()) page = "createPage";
		
		return page;
	}
	

	
	
}
