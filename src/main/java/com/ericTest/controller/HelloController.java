package com.ericTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
    public ModelAndView wellcome() {
		
		System.out.println("In controller!!!!!");
        return new ModelAndView("hello"); // 根據view resolver mapping至hello.jsp
    }
	
	@RequestMapping("/hello")
    public ModelAndView hello() {
		
		System.out.println("In controller!!!!!");
        return new ModelAndView("hello"); // 根據view resolver mapping至hello.jsp
    }
}
