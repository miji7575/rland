package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@Controller
//@RestController
public class HomeController {
	
	
	@RequestMapping("/parkmiji")
	String nana() {
		
		System.out.print("오..1212321.");
		return "되나..132123123.";
		
	}
	
	
	
	@RequestMapping("/mijihi")
	public String miji() {
		
		System.out.print("이야......");
		return "Welcome";
		
	}
	
	
	@RequestMapping("/index")
	public String index() {
		
		System.out.print("이야......");
		return "index";
		
	}
	
	
	@RequestMapping("/notice")
	public String notice() {
		
		
		
			return "공지사항";
		
	}
	
	

}
