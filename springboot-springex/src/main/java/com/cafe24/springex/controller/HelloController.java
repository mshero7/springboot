package com.cafe24.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	// ViewResolver가 찾는 방법
	// 1. 경로를 String 값으로 넘김
	// ViewName을 해석해 경로를 찾아보고 rendering 해줌.
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	// 2. ModelAndView 객체를 리턴
	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		
		// 모델 + View에 대한 설정을 할 수 있음 Model과 별차이 없는듯.
		mav.addObject("email", "상수@mshero");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		
		return mav;
	}
	
	@RequestMapping("/hello3")
	public String hello3(Model model) {
		model.addAttribute("email","doolee");
		
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello4")
	public String hello4(Model model,
			// RequestParam("파라미터 이름")으로 적어주는것이 좋다.
			@RequestParam("e") String email,
			@RequestParam String name /* 어노테이션에 value 생략시 변수이름으로 request parameter name 값을 찾는다.*/) {
		model.addAttribute("email", email);
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	/* 기술이 침투 했기 때문에 비추천*/
	@RequestMapping("/hello5")
	public String hello5(Model model,
			HttpServletRequest request,
			@RequestParam("e") String email,
			@RequestParam String name /* 어노테이션에 value 생략시 변수이름으로 request parameter name 값을 찾는다.*/) {
		request.getParameter("email");
		request.getParameter("name");

		return "/WEB-INF/views/hello.jsp";
		
	}
}
