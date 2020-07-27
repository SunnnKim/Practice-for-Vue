package com.study.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.dao.SimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

@Controller
public class MyController {

	@Autowired
	private SimpleBbsDao dao;
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JDBC 사용하기";
	}
	@RequestMapping("/all")
	public String userList() throws Exception {
		List<SimpleBbsDto> list = dao.listDao(); 
		for(SimpleBbsDto s : list) {
			System.out.println(s);
		}
		return "/";
	}
}
