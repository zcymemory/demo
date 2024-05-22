package com.test.api.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class LeverController {
	@GetMapping("egg")
    public String egg(){
		return "*****************彩蛋***********************";
        }
	
	@GetMapping("lever/total")
    public String totalLever(@RequestParam("classA") int classA,
    		@RequestParam("classB") int classB){
		if(classA < 0 | classB < 0) {
			return "Wrong number!";
		}
        int resp = classA + classB;
        if(resp > 200){
        	return "Invalid result!"; 
        }else if(resp > 100 & resp <= 200){
        	return "Lever A";
        }else if(resp > 0 & resp <=100) {
        	return "Lever B";
        }else {
        	return "Lever C";
        }
        
    }

}