package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "JSP in Gradle";
	}
	@RequestMapping("/index1")
	public @ResponseBody String test1() throws Exception{
		return "index";
	}
	@RequestMapping("/index2")
	public @ResponseBody String test2() throws Exception{
		return "index2";
	}
}
