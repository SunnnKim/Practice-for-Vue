package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Lombok test";
	}
	
	@RequestMapping("/test")
	public String test1 (HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "index";
	}
	

	
	
}
