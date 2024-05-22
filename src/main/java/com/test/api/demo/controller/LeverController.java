package com.test.api.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class LeverController {
	@GetMapping("eggs")
    public String eggs(){
		return "*****************彩蛋***********************";
        }
	
	@GetMapping("lever/total")
    public String totalLever(@RequestParam("class1") int class1,
    		@RequestParam("class2") int class2){
		if(class1 < 0 | class2 < 0) {
			return "Wrong numbers!";
		}
        int resp = class1 + class2;
        if(resp > 20){
        	return "Invalid result!!!";
        }else if(resp > 10 & resp <= 20){
        	return "Lever 1";
        }else if(resp > 0 & resp <=10) {
        	return "Lever 2";
        }else {
        	return "Lever 3";
        }
    }
}