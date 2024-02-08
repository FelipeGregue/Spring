package com.degasoft.redesocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	@RequestMapping("/palavra")
	@ResponseBody
	public String message(){
		return "Jacare";
	}
}
