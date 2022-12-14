package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
//값을 출력할 떄
@Controller
//파일 꽃을 때(VIEW 사용)
@RequestMapping("/notice/")
//클래스의 공통분모를 두는 곳
public class NoticeController {
	

//	@GetMapping("list")
//	public String list() {
//		System.out.print("이야......");
//
//		System.out.print("공지사항 목록");
//		return "공지사항 목록";
//		
//		//객체를 반환함. json 형태로 반환하기 때문에 자바스크립트가 쓰기 딱 좋다.
//	}
	
	
	
//	@GetMapping("list")
//	public List<String> noticelist() {
//		System.out.print("이야......");
//		List<String> list = new ArrayList<>();
//		
//		list.add("안녕");
//		list.add("가나다");
//		list.add("123456");
//		list.add("????");
//		
//		
//		return list";
//		//위의 방식은 값을 반환하기는 좋지만 문서를 반환 할 떄는 이것을 꽃아서 문서를 만들어야한다. 
//		//재스퍼나 타임리프 같은 것으로 가능하다.
//		// src/main/resources/templates => 타임리프를 사용하면 여기에 문서를 두면	가능하다.
//		
//		
//	}
//	
	
	
	@GetMapping("list")
	//@ResponseBody 
	//파일이 아니고 값을 출력하고 싶을 떄 ResponseBody
	public String list(Model model) {
		//Model => 스프링에 정의가 되어있음.
		
		
		
//		System.out.print("이야......");
//		List<String> list = new ArrayList<>();
//		
//		list.add("안녕");
//		list.add("가나다");
//		list.add("123456");
//		list.add("????");
		
		
		return "notice/list";
		//위의 방식은 값을 반환하기는 좋지만 문서를 반환 할 떄는 이것을 꽃아서 문서를 만들어야한다. 
		//재스퍼나 타임리프 같은 것으로 가능하다.
		// src/main/resources/templates => 타임리프를 사용하면 여기에 문서를 두면	가능하다.
		
		
	}
	
	
	
	
	@RequestMapping("detail")
	public String detail() {
		System.out.print("공지사항 디테일");
		return "공지사항 디테일";
	}
	
	

}
