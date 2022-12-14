package com.newlecture.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Menu;
import com.newlecture.web.service.DefaultMenuService;
import com.newlecture.web.service.MenuService;


@Controller
@RequestMapping("/menu")
public class MenuController {
//	==========알랜드===========
	
	

	@GetMapping("list")
	public String list(Model model) {
		
		return "/menu/list";
	}
	
	@GetMapping("detail")
	public String detail(Model model) {
		
		return "/menu/detail";
	}
	
	
	
}


//
//@Controller
//@RequestMapping("/product")
//public class MenuController {
//	
//	
//	@Autowired	//field DI
//	private MenuService service;
//	//private, public  중요하지 않다 
//	//어차피 객체 생성시 전부 들여다보기 때문에 여기다 달아도 된다. 
//	//
//	
//	
//
//	
//	
//	
//	
//	public MenuController() {
//		
//	}
//	
//	
//	//@Autowired //컨스트럭터 인젝션(Constructor DI)
//	public MenuController(MenuService service) {
//		this.service = service;
//	}
//	
//
//	//@Autowired	//세터 인젝션(Setter DI)
//	public void setService(MenuService service) {
//		this.service = service;
//		
//	}
//
//	//세터인젝션과 컨스트럭터 인젝션의 차이
//	//함수가 한번 호출되느냐 여러번호출되느냐의 차이
//	//세터(여러번) 컨스트럭터(최초한번)
//	//추가적인 로직이 있다면 세터나 컨스트럭터에 @Autowired 하겠지만
//	//그냥 DI가 목적이라면 Field에 @Autowired 다는 것이 바람직하다.
//	//그러나 오토와이어드는 최초 한번만 실행되기 떄문에 아무데나 달아도 상관이 없다.
//	//그러나 전부 사용허지 않을것이다.
//	//=> Field DI
//
//
//
//
//
//	@GetMapping("list")
//	public String list(Model model) {
//		
//		model.addAttribute("data" ,"hello");
////		service.getList();
//		service.testTS();
//		
//	
//		
//		return "product/list";
//		
//	}
//
//}
