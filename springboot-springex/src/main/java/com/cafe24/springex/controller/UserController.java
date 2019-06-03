package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.springex.vo.UserVo;

/*
 * @ReuqestMapping
 * type + method 
*/
// 있어야 Container에 들어가지!
@Controller
//
@RequestMapping("/user")
public class UserController {
	// 메시징이라 하여 다시 배움. 5장.
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	// @GetMapping("/join") 과 완전 동일하다.
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value= {"/join", "/j"}, method=RequestMethod.POST)
	// @PostMapping("/join") 완전 동일
	// 회원가입실패시 입력했던 폼을 기억하기 위해서는 Vo객체를 jsp에 넘겨주어야 한다
	// ModelAttribute 어노테이션으로 넘기면됨.
	public String join(@ModelAttribute UserVo userVo) {
		if(valid(userVo) == false) {
			return "/WEB-INF/views/join.jsp";
		}
		System.out.println(userVo);
		return "redirect:/hello";
	}
	
	private boolean valid(UserVo userVo) {
		return false;
	}
}
