package com.cafe24.springex.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @ReuqestMapping
 * Method 단독 매핑 
*/

@Controller
@RequestMapping("/board")
public class BoardController {
	

	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable(value="no") Long no) {
		return "BoardController:view("+ no +")";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(
			//String name
			// @RequestParam String name
			@RequestParam("n") String name
		) {
		System.out.println("---"+ name + "---");
		return "BoardController:update()";
	}
	
	@ResponseBody
	@RequestMapping("/write")
	public String write(
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="age", required=true, defaultValue="0") int age
		) {
		System.out.println("---"+ name + "---");
		return "BoardController:write()";
	}
}
