package com.test.api.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {
	
	@RequestMapping("")
	public String hello() {
		return "欢迎使用！！！";
		}
	
}