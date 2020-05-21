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
		return "Form 데이터 전달받아 사용하기 ";
	}
	
	@RequestMapping("/index1")
	public String test1 (HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "index";
	}
	
	@RequestMapping("/index2")
	public String test2 (	@RequestParam("id") String id,
							@RequestParam("name") String name,
							Model model) {
		
		// 파라미터가 많으면 불편해진다.
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "index2";
	}
	
	
	@RequestMapping("/index3")
	public String test3 (Member member, Model model) {
		
		// 파라미터와 일치하는 빈을 만들어 사용할 수 있다.
		// View 페이지에서 model을 사용하지 않고 member를 사용한다.
		model.addAttribute("member",member);
		
		return "index3";
	}
	
	@RequestMapping("/index4/{studentId}/{studentName}")
	public String test4 (	@PathVariable String studentId,
							@PathVariable String studentName,
							Model model) {
		// 패스 자체에 변수를 넣어줄 수 있다.
		model.addAttribute("studentId",studentId);
		model.addAttribute("studentName", studentName);
		
		return "index4";
	}
	
	
	
	
	
}
