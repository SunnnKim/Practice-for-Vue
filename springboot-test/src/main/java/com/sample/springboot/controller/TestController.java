package com.sample.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	
	@RequestMapping(value="test")
	public void test() {
		System.out.println("test Controller");
	}
	
}
