package com.example.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "/WEB-INF/views/index.jsp";
	}
	
	/*@RequestMapping("/hello2")
	public ModelAndView hello(@RequestParam String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello", "Hello"+name);
		mav.setViewName("/WEB-INF/views/index.jsp");
		
		return mav;
		
	}*/
}
